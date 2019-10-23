
package acme.features.anonymous.bulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.bulletins.RuizBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousRuizBulletinRepository extends AbstractRepository {

	@Query("select s from RuizBulletin s")
	Collection<RuizBulletin> findMany();
}
