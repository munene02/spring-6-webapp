package ke.co.evokemedia.spring6webapp.services;

import ke.co.evokemedia.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
