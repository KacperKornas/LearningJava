package internet;

public class TeaMaker {
    public static void main(String[] args) {
        String water = "zimna woda";
        String teaBag = "herbata";

        String tea = prepareTea(water, teaBag);

        System.out.println("Herbata: " + tea);
    }

    public static String prepareTea(String water, String teaBag) {
         boolean hasWater = water.equals("zimna woda");
         boolean hasTeaBag = !teaBag.isEmpty();

         if(hasWater && hasTeaBag) {
             return "Gorąca woda z " + teaBag;
         }
         return "Brak składników!";
    }
}
