package ke.co.evokemedia.spring6webapp.domain.bootstrap;

import ke.co.evokemedia.spring6webapp.domain.Author;
import ke.co.evokemedia.spring6webapp.domain.Book;
import ke.co.evokemedia.spring6webapp.repositories.AuthorRepository;
import ke.co.evokemedia.spring6webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author();
        author.setFirstName("John");
        author.setLastName("Grisham");

        Book book = new Book();
        book.setTitle("The Juror");
        book.setIsbn("ISBN12345");

        Author author2 = new Author();
        author2.setFirstName("Robert");
        author2.setLastName("Ludlum");

        Book book2 = new Book();
        book2.setTitle("The Cry of the Halidon");
        book2.setIsbn("ISBN1234567");

        Book savedBook = bookRepository.save(book);
        Author savedAuthor = authorRepository.save(author);
        Book savedBook2 = bookRepository.save(book2);
        Author savedAuthor2 = authorRepository.save(author2);

        savedAuthor.getBooks().add(savedBook);
        savedAuthor2.getBooks().add(savedBook2);

        authorRepository.save(savedAuthor);
        authorRepository.save(savedAuthor2);

        System.out.println("In Bootstrap...");
        System.out.println("Author count : " + authorRepository.count());
        System.out.println("In Bootstrap : " + bookRepository.count());


    }
}
