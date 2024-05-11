
public class App {
   public static void main(String[] args) throws Exception
   {
    DynamicArray dynamicArray = new DynamicArray();
    System.out.println(dynamicArray.capacity);
    dynamicArray.add("yee1");
    dynamicArray.add("yee2");
    dynamicArray.delete("yee2");
    dynamicArray.toString();

   }
}
