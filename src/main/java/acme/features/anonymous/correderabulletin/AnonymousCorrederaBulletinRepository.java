
package acme.features.anonymous.correderabulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.correderabulletins.CorrederaBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousCorrederaBulletinRepository extends AbstractRepository {

	@Query("select s from CorrederaBulletin s")
	Collection<CorrederaBulletin> findMany();
}
