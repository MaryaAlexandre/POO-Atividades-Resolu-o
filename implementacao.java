public class implementacao {
  public static void main(String[] args) {
    // Criando alguns autores
    Author author1 = new Author("George Orwell", "orwell@example.com");
    Author author2 = new Author("Harper Lee", "lee@example.com");

    // Criando alguns livros
    Book book1 = new Book("1984", author1, "1234567890", 3);
    Book book2 = new Book("To Kill a Mockingbird", author2, "0987654321", 2);

    // Adicionando livros aos autores
    author1.addBook(book1);
    author2.addBook(book2);

    // Criando alguns usuários
    User user1 = new User("Alice", "U001");
    User user2 = new User("Bob", "U002");

    // Usuários emprestando livros
    user1.borrowBook(book1);
    user1.borrowBook(book2);
    user2.borrowBook(book1);

    // Exibindo informações dos usuários e seus livros emprestados
    System.out.println("Usuário: " + user1.getName() + " (ID: " + user1.getUserId() + ")");
    for (Book book : user1.getBorrowedBooks()) {
      System.out.println(" - Livro emprestado: " + book.getTitle() + " por " + book.getAuthor().getName());
    }

    System.out.println("Usuário: " + user2.getName() + " (ID: " + user2.getUserId() + ")");
    for (Book book : user2.getBorrowedBooks()) {
      System.out.println(" - Livro emprestado: " + book.getTitle() + " por " + book.getAuthor().getName());
    }

    // Usuários devolvendo livros
    user1.returnBook(book1);
    user2.returnBook(book1);

    // Exibindo informações dos usuários após devolverem livros
    System.out.println("Usuário: " + user1.getName() + " (ID: " + user1.getUserId() + ")");
    for (Book book : user1.getBorrowedBooks()) {
      System.out.println(" - Livro emprestado: " + book.getTitle() + " por " + book.getAuthor().getName());
    }

    System.out.println("Usuário: " + user2.getName() + " (ID: " + user2.getUserId() + ")");
    for (Book book : user2.getBorrowedBooks()) {
      System.out.println(" - Livro emprestado: " + book.getTitle() + " por " + book.getAuthor().getName());
    }
  }
}
