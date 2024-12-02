public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        //natoWord('Z');
        char letter = 'A';

        switch (letter) {
            case 'A':
                System.out.println("A = Alpha");
                break;
            case 'B':
                System.out.println("B = Bravo");
                break;
            case 'C':
                System.out.println("C = Charlie");
                break;
            case 'D':
                System.out.println("D = Delta");
                break;
            default:
                System.out.println(letter + " was not found in the switch");

        }
//    public static String natoWord(char letter) {
//        switch (letter){
//            case 'A':
//                System.out.println("A = Alpha");
//                break;
//            case 'B':
//                System.out.println("B = Bravo");
//                break;
//            case 'C':
//                System.out.println("C = Charlie");
//                break;
//            case 'D':
//                System.out.println("D = Delta");
//                break;
//            default:
//                return letter + " not found";
//
//        }
//        return "";
//    }

    }
}