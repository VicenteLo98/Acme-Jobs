
package acme.features.anonymous.sanjosebulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.sanjosebulletin.SanJoseBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousBulletinCreateService implements AbstractCreateService<Anonymous, SanJoseBulletin> {

	@Autowired
	AnonymousBulletinRepository repository;


	@Override
	public void bind(final Request<SanJoseBulletin> request, final SanJoseBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
		request.bind(entity, errors);
	}

	@Override
	public SanJoseBulletin instantiate(final Request<SanJoseBulletin> request) {
		assert request != null;

		SanJoseBulletin result;

		result = new SanJoseBulletin();
		result.setName("Daniel");
		result.setSecondname("San José García");
		result.setCompany("Nintendo");
		return result;
	}

	@Override
	public void validate(final Request<SanJoseBulletin> request, final SanJoseBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<SanJoseBulletin> request, final SanJoseBulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);
	}

	@Override
	public boolean authorise(final Request<SanJoseBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<SanJoseBulletin> request, final SanJoseBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "secondname", "company");

	}

}
