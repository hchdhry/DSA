public class App {
    public static void main(String[] args) throws Exception {
       int Array[] = new int[1000000];
       int target = 34;

       for(int i = 0;i<1000000;i++)
       {
        Array[i] = i;
       }
   
       int index = binarySearch(Array, target);
      

    }
    
    private static int binarySearch(int[] Array, int target) 
    {
        int low =0;
        int high = Array.length-1;

        while (low<=high) {
          int middle = low +(high-low)/2;
          int value = Array[middle];
          System.out.println("middle: " + value);

          if(value<target) low = middle+1;
          else if(value>target) high = middle-1;
          else return middle;
        }
        return -1;

    }
}
