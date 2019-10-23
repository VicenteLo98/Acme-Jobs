
package acme.features.anonymous.sanjosebulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.sanjosebulletin.SanJoseBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousBulletinRepository extends AbstractRepository {

	@Query("select s from SanJoseBulletin s")
	Collection<SanJoseBulletin> findMany();
}
