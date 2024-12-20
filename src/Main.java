public class Main {
    public static void main(String[] args) {

        Author PiratesOfTheCaribbean = new Author("Rob", "Kidd");
        Book Book = new Book("Pirates of the Caribbean", PiratesOfTheCaribbean, 2006);
        System.out.println(Book);

        System.out.println();

        Author MisteriousIsland = new Author("Jules", "Verne");
        Book Misterious = new Book("Misterious Island", MisteriousIsland, 1877);
        System.out.println(Misterious);

        System.out.println();

        System.out.println(Book.equals(Misterious));
        System.out.println();

        Author Barry = new Author("Pitt", "Barns");
        Book Nick = new Book("Speed", Barry, 2002);

        Author Allen = new Author("Pit", "Barns");
        Book Grey = new Book("Speed", Allen, 2002);

        System.out.println(Grey.equals(Nick));
    }
}