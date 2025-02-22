import java.util.Scanner;

// create array of e, by using all values of e, cipher text should be same
// ask the user to choose the value of e

public class RSA{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int p = 5;
        int q = 7; 
        int e = 5;
        int n = p * q;

        int M = 0;

       System.out.println("Enter the Plain Text Value");
       M = sc.nextInt();
       sc.close();
       int C = rsa_encrypt(M,p,q,e,n);
       int D = rsa_decrypt(C,p,q,e,n);
       System.out.println("Encrypted Value is: " + C);
       System.out.println("Decrypted Value is: " + D);
    }

    public static int rsa_encrypt(int M, int p, int q, int e, int n){
        int C = 0;

        C = (int) (Math.pow(M,e) % n);

        return C;
    }

    public static int rsa_decrypt(int C, int p, int q, int e, int n){
        int M = 0;
        int m = (p - 1) * (q - 1);

        int d = 0;
        int i = 1;
        while (((m * i) + 1) % e == 0){
            d = ((m * i) + 1) % e;
        }

        M = (int) (Math.pow(C, d) % n);

        return M; 
    }
}