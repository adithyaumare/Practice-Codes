import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        //Increasing Loop
        for (int i = 0; i < number; i++){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Decreasing Loop
        for(int i = number; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}