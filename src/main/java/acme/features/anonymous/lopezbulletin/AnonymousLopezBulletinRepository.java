
package acme.features.anonymous.lopezbulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.lopezbulletins.LopezBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousLopezBulletinRepository extends AbstractRepository {

	@Query("select lb from LopezBulletin lb")
	Collection<LopezBulletin> findMany();
}
