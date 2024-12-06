public class LogicalOpTable {
    public static void main(String[] args) {
        int p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = 1; q = 1;
        System.out.print(p + "\t\t" + q + "\t\t");
        System.out.print((p&q)  + "\t\t" + (p|q) + "\t\t");
        System.out.println((p^q) + "\t\t" + (p>0 ? 0:1));

        p = 1; q = 0;
        System.out.print(p + "\t\t" + q + "\t\t");
        System.out.print((p&q)  + "\t\t" + (p|q) + "\t\t");
        System.out.println((p^q) + "\t\t" + (p>0 ? 0:1));

        p = 0; q = 1;
        System.out.print(p + "\t\t" + q + "\t\t");
        System.out.print((p&q)  + "\t\t" + (p|q) + "\t\t");
        System.out.println((p^q) + "\t\t" + (p>0 ? 0:1));

        p = 0; q = 0;
        System.out.print(p + "\t\t" + q + "\t\t");
        System.out.print((p&q)  + "\t\t" + (p|q) + "\t\t");
        System.out.println((p^q) + "\t\t" + (p>0 ? 0:1));
    }
}
