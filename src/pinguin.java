import java.util.Scanner;


public class pinguin {

    public static void main(String args[]) {

        String naam = "";
        int leeftijd;
        String oogKleur = "";
        int postcodeInt = 0;
        String postcodeString = "";
        String woonplaats = "";
        int pincode;

    Scanner sc = new Scanner(System.in);

    System.out.println("Goedemiddag! Wat is uw naam?");
        naam = sc.nextLine();

    System.out.println("Goedemiddag, " + naam + ".");

    System.out.println("Wat is uw leeftijd?");
        leeftijd = sc.nextInt();

    System.out.println("U bent " + leeftijd + " jaar oud.");

    System.out.println("Wat is uw oogkleur?");
        oogKleur = sc.next();

    System.out.println("Uw oogkleur is " + oogKleur );

    System.out.println("Wat zijn de cijfers van uw postcode?");
        postcodeInt = sc.nextInt();
    System.out.println("Wat zijn de letters van uw postcode?");
        postcodeString = sc.next();
    System.out.println("Uw postcode is " + postcodeInt + postcodeString);

    System.out.println("Wat is uw woonplaats?");
        woonplaats = sc.next();

    System.out.println("Uw woonplaats is " + woonplaats);

    System.out.println("Dus, " + naam + ", U bent " + leeftijd + " jaar oud, uw oogkleur is " + oogKleur + " en uw " +
            "postcode is " + postcodeInt + postcodeString + ". En u woont in " + woonplaats + ". Wat is uw pincode?");
        pincode = sc.nextInt();

    System.out.println("Dankuwel! Uw bankrekening word op dit moment leeggehaald...");
    }
}