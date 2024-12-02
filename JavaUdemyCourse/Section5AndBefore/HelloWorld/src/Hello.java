public class Hello {
    public static void main(String[] args) {


        double firstValue = 20;
        double secondValue = 80;
        double calculations = (firstValue + secondValue) * 100;
        System.out.println("calculations = " + calculations);
        double remainder = calculations % 40;
        System.out.println("remainder = " + remainder);


        boolean checkZero = remainder == 0;
        System.out.println(checkZero);


        if (!checkZero)
            System.out.println("I got some remainder!");

    }
}

