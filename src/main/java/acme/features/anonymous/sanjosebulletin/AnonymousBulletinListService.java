
package acme.features.anonymous.sanjosebulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.sanjosebulletin.SanjoseBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousBulletinListService implements AbstractListService<Anonymous, SanjoseBulletin> {

	@Autowired
	AnonymousBulletinRepository repository;


	@Override
	public boolean authorise(final Request<SanjoseBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<SanjoseBulletin> request, final SanjoseBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "name", "secondname", "company");
	}

	@Override
	public Collection<SanjoseBulletin> findMany(final Request<SanjoseBulletin> request) {
		assert request != null;
		Collection<SanjoseBulletin> result;
		result = this.repository.findMany();

		return result;
	}

}
