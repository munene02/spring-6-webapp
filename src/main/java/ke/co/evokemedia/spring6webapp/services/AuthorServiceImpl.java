package ke.co.evokemedia.spring6webapp.services;

import ke.co.evokemedia.spring6webapp.domain.Author;
import ke.co.evokemedia.spring6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
