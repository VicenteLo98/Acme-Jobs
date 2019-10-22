
package acme.features.anonymous.correderabulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.correderabulletins.CorrederaBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousBulletinListService implements AbstractListService<Anonymous, CorrederaBulletin> {

	@Autowired
	AnonymousBulletinRepository repository;


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

	@Override
	public Collection<CorrederaBulletin> findMany(final Request<CorrederaBulletin> request) {
		assert request != null;
		Collection<CorrederaBulletin> result;
		result = this.repository.findMany();

		return result;
	}

}
