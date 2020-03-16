
public class Main {
    public static void main(String args[]) {


        Phonebook phonebook = new Phonebook();



        phonebook.add("Peuc", " Jovan", "654554");
        phonebook.add("Petrovic", " Janko", "654554");
        phonebook.add("Perc", " Janko", "654554");
        phonebook.add("Merix", " Marija", "654554");
        phonebook.add("Markovic", "Ivana", "654554");
        phonebook.add("Stokic", " Jovan", "654554");
        phonebook.add("Savic", " Jana", "654554");
        phonebook.add("Sablic", " Jerko", "654554");
        phonebook.add("Jovanovic", " Koman", "654554");
        phonebook.add("Jankovic", " Sara", "654554");


        phonebook.printAll();

    }
}
