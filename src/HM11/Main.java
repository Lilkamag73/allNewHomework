package HM11;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author orwell = new Author("Джордж", "Оруэлл");

        Book warAndPeace = new Book("Война и мир", tolstoy, 1869);
        Book book1984 = new Book("1984", orwell, 1948);

        book1984.setPublicationYear(1949);

        System.out.println("Книга: " + warAndPeace.getTitle() +
                ", Автор: " + warAndPeace.getAuthor().getFirstName() + " " + warAndPeace.getAuthor().getLastName() +
                ", Год: " + warAndPeace.getPublicationYear());

        System.out.println("Книга: " + book1984.getTitle() +
                ", Автор: " + book1984.getAuthor().getFirstName() + " " + book1984.getAuthor().getLastName() +
                ", Год: " + book1984.getPublicationYear());
    }
}