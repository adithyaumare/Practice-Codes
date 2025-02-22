public class secondlargest{
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 0, 39, 22};
        
        
        int largest = arr[0];
        int slargest = -1;

        for (int i = 0; i < arr.length; i++){

            if (largest < arr[i]){
                slargest = largest;
                largest = arr[i];
            }
            
            if (arr[i] > slargest && arr[i] < largest){
                slargest = arr[i];
            }
        }
        
        System.out.println(slargest);
    }
}