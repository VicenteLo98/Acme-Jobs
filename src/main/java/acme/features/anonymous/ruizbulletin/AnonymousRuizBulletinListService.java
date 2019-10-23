
package acme.features.anonymous.ruizbulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.ruizbulletins.RuizBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousRuizBulletinListService implements AbstractListService<Anonymous, RuizBulletin> {

	@Autowired
	AnonymousRuizBulletinRepository repository;


	@Override
	public boolean authorise(final Request<RuizBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<RuizBulletin> request, final RuizBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "job", "company", "moment");
	}

	@Override
	public Collection<RuizBulletin> findMany(final Request<RuizBulletin> request) {
		assert request != null;
		Collection<RuizBulletin> result;
		result = this.repository.findMany();

		return result;
	}

}
