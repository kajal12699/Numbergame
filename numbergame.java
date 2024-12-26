import java.util.Scanner;
public class Numbergame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int possibility = 10;
        int finals = 0;
        boolean Again = true;
        System.out.println(" Welcome friend");
        System.out.println("Hello friend you have about " + possibility + " possibility to  win the game ");
        while (Again) {
            int rand = getrandN(1, 100);
            boolean guess = false;
            for (int i = 0; i < possibility; i++) {
                System.out.println("possibility" + (i + 1) + " Enter your guess here :");
                int user = input.nextInt();
                if (user == rand) {
                    guess = true;
                    finals += 1;
                    System.out.println(" you won it buddy ");
                    break;
                } else if (user > rand) {
                    System.out.println(" The value is too high");
                } else {
                    System.out.println(" The value is too low ");
                }
            }
            if (guess == false) {
                System.out.println(" Sorry Friend you lost the chances. The real number is :" + rand);
            }
            System.out.println(" Friend,Do you want to play again(yes/no)");
            String s = input.next();
            Again = s.equalsIgnoreCase("yes");

        }
        System.out.println(" That's it friend ,Hope you enjoyed it very Well");
        System.out.println(" Here is your final score " + finals);
    }

    public static int getrandN(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }

}
