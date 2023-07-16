package ProgrammingWithClasses;

public class BookArray {
    private Book[] books;

    public BookArray(Book[] books) {
        this.books = books;
    }

    public void printBooksByAuthor(String author) {
        for (Book book : books) {
            String[] authors = book.getAuthors();
            for (String authorName : authors) {
                if (authorName.equalsIgnoreCase(author)) {
                    System.out.println(book);
                    break;
                }
            }
        }
    }

    public void printBooksByPublisher(String publisher) {
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                System.out.println(book);
            }
        }
    }

    public void printBooksAfterYear(int year) {
        for (Book book : books) {
            if (book.getYear() > year) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book(1, "Java Programming", new String[]{"John Smith"}, "ABC Publications", 2020, 500,
                29.99, "Hardcover");
        Book book2 = new Book(2, "Python for Beginners", new String[]{"Jane Johnson"}, "XYZ Books", 2019, 400,
                24.99, "Paperback");
        Book book3 = new Book(3, "C# In Depth", new String[]{"David Davis", "Mark Wilson"}, "ABC Publications",
                2021, 600, 39.99, "Hardcover");
        Book book4 = new Book(4, "Ruby Cookbook", new String[]{"Anna Adams"}, "XYZ Books", 2018, 350, 19.99,
                "Paperback");
        Book book5 = new Book(5, "JavaScript Basics", new String[]{"Robert Roberts"}, "XYZ Books", 2022, 450,
                29.99, "Paperback");

        Book[] books = {book1, book2, book3, book4, book5};

        BookArray bookArray = new BookArray(books);

        System.out.println("Books by author 'John Smith':");
        bookArray.printBooksByAuthor("John Smith");

        System.out.println();

        System.out.println("Books published by 'XYZ Books':");
        bookArray.printBooksByPublisher("XYZ Books");

        System.out.println();

        int year = 2020;
        System.out.println("Books published after " + year + ":");
        bookArray.printBooksAfterYear(year);
    }
}