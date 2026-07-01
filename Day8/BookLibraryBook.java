package Day8;

class Book {

    void showTitle() {
        System.out.println("Java Programming");
    }
}

class LibraryBook extends Book {

    void issueBook() {
        System.out.println("Book Issued Successfully");
    }
}

public class BookLibraryBook {

    public static void main(String[] args) {

        LibraryBook lb = new LibraryBook();

        lb.showTitle();
        lb.issueBook();
    }
}