
package acme.features.anonymous.cordonbulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.cordonbulletins.CordonBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface CordonBulletinRepository extends AbstractRepository {

	@Query("select s from CordonBulletin s")
	Collection<CordonBulletin> findMany();

}
