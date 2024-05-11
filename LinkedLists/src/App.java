import java.util.LinkedList;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> LinkedList = new LinkedList<Integer>();
        ArrayList<Integer> ArrayList = new ArrayList<Integer>();

        long starTime;
        long endTime;
        long elapsedTime;


       
        for(int i=0;i<1000000;i++)
        {
             LinkedList.add(i);
             ArrayList.add(i);
        }
        starTime = System.nanoTime();
        LinkedList.remove(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - starTime;
        System.out.println("elapsed time for linked list: " + elapsedTime);

        starTime = System.nanoTime();
        ArrayList.remove(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - starTime;
        System.out.println("elapsed time for array list : " + elapsedTime);
        
    }
}
