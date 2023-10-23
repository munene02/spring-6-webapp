package ke.co.evokemedia.spring6webapp.services;

import ke.co.evokemedia.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
