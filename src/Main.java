public class Main {
    public static void main(String[] args) {

        Author PiratesOfTheCaribbean = new Author("Rob", "Kidd");
        Book Book = new Book("Pirates of the Caribbean", PiratesOfTheCaribbean, 2006);
        System.out.println("Book = " + Book.getName());
        System.out.println("Author = " + PiratesOfTheCaribbean.getFirstName() + " " + PiratesOfTheCaribbean.getLastName());
        System.out.println("Book years = " + Book.getYears());

        System.out.println();

        Author MisteriousIsland = new Author("Jules", "Verne");
        Book Misterious = new Book("Misterious Island", MisteriousIsland, 1877);
        System.out.println("Book = " + Misterious.getName());
        System.out.println("Author = " + MisteriousIsland.getFirstName() + " " + MisteriousIsland.getLastName());

        Misterious.setYears(1875);
        System.out.println("Book years = " + Misterious.getYears());

    }
}