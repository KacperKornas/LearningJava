//bubble sorting

public class Test5E4 {
    public static void main(String[] args) {
        String[] texts = {"Bi", "Bo", "EA", "EO", "DP", "DA", "Kajaki", "Kajak", "A", "F"};

        int a, b;
        String t;

        System.out.println("Primary array:");
        for(int i = 0; i < texts.length; i++)
            System.out.print(" " + texts[i]);
        System.out.println();

        for(a=1; a < texts.length; a++)
            for(b=texts.length-1; b >= a; b--) {
                if(texts[b-1].compareTo(texts[b]) > 0) {
                    t = texts[b-1];
                    texts[b-1] = texts[b];
                    texts[b] = t;
                }
            }
        System.out.println("Posortowana tablica:");
        for (int i = 0; i < texts.length; i++)
            System.out.print(" " + texts[i]);
        System.out.println();
    }
}
