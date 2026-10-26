import java.util.Scanner;

public class Main {
    void main(){

        Scanner llegir  = new Scanner(System.in);

        int[] numerosentrada = new int[8];
        int positius = 0;
        int negatius = 0;
        int zeros = 0;


        for (int i = 0; i < numerosentrada.length; i++) {
            System.out.println("Introdueix el número " + (i + 1) + ":");
            numerosentrada[i] = llegir.nextInt();
        }

        for  (int i = 0; i < numerosentrada.length; i++) {
            if (numerosentrada[i] == 0) {
                zeros = zeros + 1;
            } if (numerosentrada[i] > 0) {
                positius = positius + 1;
            } if (numerosentrada[i] < 0)  {
                negatius = negatius + 1;
            }
        }

        System.out.print("Has introduït els números:");
        for (int i = 0; i < numerosentrada.length; i++) {
            System.out.print(" " + numerosentrada[i]);
        }
        System.out.println(".");

        System.out.println("Positius: " + positius + " | " + "Negatius: " + negatius + " | " + "Zeros: " + zeros);
    }
}
