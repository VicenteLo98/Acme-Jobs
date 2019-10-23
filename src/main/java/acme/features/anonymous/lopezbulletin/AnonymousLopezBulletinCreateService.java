
package acme.features.anonymous.lopezbulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.lopezbulletins.LopezBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousLopezBulletinCreateService implements AbstractCreateService<Anonymous, LopezBulletin> {

	@Autowired
	AnonymousLopezBulletinRepository repository;


	@Override
	public void bind(final Request<LopezBulletin> request, final LopezBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
		request.bind(entity, errors);
	}

	@Override
	public LopezBulletin instantiate(final Request<LopezBulletin> request) {
		assert request != null;

		LopezBulletin result;

		result = new LopezBulletin();
		result.setNombre("Jhon Doe");
		result.setDni("12345678X");
		result.setDescripcion("-Trabaja bien en equipo");
		return result;
	}

	@Override
	public void validate(final Request<LopezBulletin> request, final LopezBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<LopezBulletin> request, final LopezBulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);
	}

	@Override
	public boolean authorise(final Request<LopezBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<LopezBulletin> request, final LopezBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "nombre", "dni", "descripcion");

	}

}
