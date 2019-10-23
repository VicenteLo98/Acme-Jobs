
package acme.features.anonymous.sanjosebulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.sanjosebulletin.SanJoseBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousBulletinListService implements AbstractListService<Anonymous, SanJoseBulletin> {

	@Autowired
	AnonymousBulletinRepository repository;


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

	@Override
	public Collection<SanJoseBulletin> findMany(final Request<SanJoseBulletin> request) {
		assert request != null;
		Collection<SanJoseBulletin> result;
		result = this.repository.findMany();

		return result;
	}

}
