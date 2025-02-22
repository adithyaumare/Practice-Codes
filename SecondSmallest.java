public class SecondSmallest {
    public static void main(String[] args) 
    {
        int[] arr = {3, 2, 1, 24, 39, 22};
        int smallest = 39;
        int secondsmallest = 40;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] < smallest)
            {
                secondsmallest = smallest;
                smallest = arr[i]; 
              
            } 
            else if(arr[i]>smallest && arr[i]<secondsmallest) 
            {
                secondsmallest = arr[i];
            }
        }

        System.out.println(secondsmallest);
    }
}
