
package acme.features.anonymous.ruizbulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.ruizbulletins.RuizBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousRuizBulletinRepository extends AbstractRepository {

	@Query("select s from RuizBulletin s")
	Collection<RuizBulletin> findMany();
}
