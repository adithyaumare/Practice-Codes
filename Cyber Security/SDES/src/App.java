import java.util.Arrays;

public class App {

    public static int[] P10(int[] key){
        int[] permutation = {3,5,2,7,4,10,1,9,8,6};
        int[] res = new int[key.length];
        for(int i = 0; i < res.length; i++){
            res[i] = key[permutation[i] - 1];
        }
        return res;
    }

    public static int[] leftshift(int[] key){
        int temp = key[0];
        int[] leftshift = new int[key.length];

        for (int i = 0; i < key.length - 1; i++) {
            leftshift[i] = key[i + 1];
        }

        leftshift[leftshift.length - 1] = temp;

        return leftshift;
    }

    public static void main(String[] args) throws Exception {

        int[] key = {1,0,1,0,0,0,0,0,1,0};
        System.out.println("Original Key: " + Arrays.toString(key));
        System.out.println("Key after P10: " + Arrays.toString(P10(key)));
        System.out.println("Array after Left Shift: " + Arrays.toString(leftshift(key)));
    }
}
