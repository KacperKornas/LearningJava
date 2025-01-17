public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        double d;
        int i;

        System.out.println("BigQ przechowuje alfabet.");
        for (i = 0; i <26; i++) {
            bigQ.put(1 + i);
        }

        System.out.println("Zawartość kolejki bigQ: ");
        for (i=0; i < 26; i ++) {
            d = bigQ.get();
            if (d != 0) System.out.print(d + ", ");
        }

        System.out.println("\n");

        System.out.println("Używam kolejki smallQ do wygenerowania błędów.");
        for (i=0; i < 5; i++) {
            System.out.println("Próbuję umieścić w kolejce znak " + (26 - i ));
            smallQ.put(26 - i );
        }

        System.out.println();

        System.out.print("Zawartość kolejki smallQ: ");
        for (i=0; i < 5; i++) {
            d = smallQ.get();

            if(d != 0) System.out.print(d + ", ");
        }
    }
}

class Queue {
    private double q[];
    private int putloc, getloc;

    Queue(int size) {
        q = new double[size];
        putloc = getloc = 0;
    }

    void put(double ch) {
        if(putloc==q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    double get() {
        if (getloc == putloc) {
            System.out.println(" -- Queue is empty");
            return 0;
        }

        return q[getloc++];
    }
}

