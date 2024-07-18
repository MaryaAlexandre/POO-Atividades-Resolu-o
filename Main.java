import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private Author author;
    private String isbn;
    private int availableCopies; 

    public Book(String title, Author author, String isbn, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAvailableCopies(int copies) {
        this.availableCopies = copies;
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Não há cópias disponíveis para empréstimo.");
        }
    }

    public void returnBook() {
        availableCopies++;
        System.out.println("Livro devolvido com sucesso.");
    }
}

class Author {
    private String name;
    private String email;
    private List<Book> books;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;  
    }

    public String getEmail() {
        return email;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}

class User {
    private String name;
    private String userId;
    private List<Book> borrowedBooks;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(name + " emprestou o livro " + book.getTitle() + "."); 
        } else {
            System.out.println("Não há cópias disponíveis para empréstimo.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " devolveu o livro " + book.getTitle() + ".");
        } else {
            System.out.println("Este livro não foi emprestado por " + name + ".");
        }
    }
}
