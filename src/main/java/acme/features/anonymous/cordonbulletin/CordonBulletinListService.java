
package acme.features.anonymous.cordonbulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.cordonbulletins.CordonBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class CordonBulletinListService implements AbstractListService<Anonymous, CordonBulletin> {

	@Autowired
	CordonBulletinRepository repository;


	@Override
	public boolean authorise(final Request<CordonBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<CordonBulletin> request, final CordonBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "author", "company", "description");

	}

	@Override
	public Collection<CordonBulletin> findMany(final Request<CordonBulletin> request) {
		assert request != null;
		Collection<CordonBulletin> result;
		result = this.repository.findMany();

		return result;
	}

}
