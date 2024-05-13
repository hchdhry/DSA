public class App {
    public static void main(String[] args) throws Exception {

        int array[] = {2,4,1,3,99,23,53,11,32,12};

        BubbleSort(array);
        
      for (int i : array) {
        System.out.println(i);
      }
       
        
        
    }
    private static int[] BubbleSort(int[] array)
        {
            
          for(int i = 0; i<=array.length-1;i++)
          {
            for(int j = 0; j <array.length - 1; j++)
            {  
                if(array[j]>array[j+1]) 
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

          }

          
            return array;


        } 
}
