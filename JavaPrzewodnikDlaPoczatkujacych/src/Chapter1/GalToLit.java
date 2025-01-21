package Chapter1;

public class GalToLit {
    public static void main(String[] args) {

        double gal, lit;
        for (gal = 1; gal <= 100; gal++){
            lit = gal * 3.7854;
            System.out.println(gal + " galonów odpowiada " + lit + " litrom.");
            if (gal % 10 == 0.0) {
                System.out.println();
            }
        }
    }
}