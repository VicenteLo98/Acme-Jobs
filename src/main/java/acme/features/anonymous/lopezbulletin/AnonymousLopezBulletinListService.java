
package acme.features.anonymous.lopezbulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.lopezbulletins.LopezBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousLopezBulletinListService implements AbstractListService<Anonymous, LopezBulletin> {

	@Autowired
	AnonymousLopezBulletinRepository repository;


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

	@Override
	public Collection<LopezBulletin> findMany(final Request<LopezBulletin> request) {
		assert request != null;
		Collection<LopezBulletin> result;
		result = this.repository.findMany();

		return result;
	}

}
