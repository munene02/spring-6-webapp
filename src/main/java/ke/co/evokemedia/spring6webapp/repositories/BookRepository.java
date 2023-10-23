package ke.co.evokemedia.spring6webapp.repositories;

import ke.co.evokemedia.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
