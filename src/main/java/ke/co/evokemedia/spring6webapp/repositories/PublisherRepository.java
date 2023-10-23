package ke.co.evokemedia.spring6webapp.repositories;

import ke.co.evokemedia.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
