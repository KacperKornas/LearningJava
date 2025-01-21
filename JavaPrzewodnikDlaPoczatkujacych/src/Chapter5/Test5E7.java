package Chapter5;

public class Test5E7 {
    public static void main(String[] args) {
        String msg = "It is a test";
        String key= "mySecret";
        String encmsg = "";
        String decmsg = "";

        System.out.print("Original message: ");
        System.out.println(msg);

        for(int i=0; i < msg.length(); i++)
            encmsg = encmsg + (char) ( msg.charAt(i) ^ key.charAt(i % key.length()));

        System.out.print("Encrypted message: ");
        System.out.println(encmsg);

        for(int i=0; i < msg.length(); i++)
            decmsg = decmsg + (char) ( encmsg.charAt(i) ^ key.charAt(i % key.length()));

        System.out.print("Decrypted message: ");
        System.out.println(decmsg);
    }
}
