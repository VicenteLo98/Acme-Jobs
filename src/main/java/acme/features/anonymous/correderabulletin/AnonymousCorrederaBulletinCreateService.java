
package acme.features.anonymous.correderabulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.correderabulletins.CorrederaBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousCorrederaBulletinCreateService implements AbstractCreateService<Anonymous, CorrederaBulletin> {

	@Autowired
	AnonymousCorrederaBulletinRepository repository;


	@Override
	public void bind(final Request<CorrederaBulletin> request, final CorrederaBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
		request.bind(entity, errors);
	}

	@Override
	public CorrederaBulletin instantiate(final Request<CorrederaBulletin> request) {
		assert request != null;

		CorrederaBulletin result;

		result = new CorrederaBulletin();
		result.setNombre("Jhon Doe");
		result.setFundador("Lorem ipsum!");
		return result;
	}

	@Override
	public void validate(final Request<CorrederaBulletin> request, final CorrederaBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<CorrederaBulletin> request, final CorrederaBulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);
	}

	@Override
	public boolean authorise(final Request<CorrederaBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<CorrederaBulletin> request, final CorrederaBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "nombre", "fundador");

	}

}
