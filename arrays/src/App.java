
public class App {
   public static void main(String[] args) throws Exception
   {
    DynamicArray dynamicArray = new DynamicArray();
    System.out.println(dynamicArray.capacity);
    dynamicArray.add("yee1");
    dynamicArray.add("yee2");
     dynamicArray.add("yee3");
     dynamicArray.add("yee4");
     dynamicArray.add("yee4");
     dynamicArray.add("yee4");
     dynamicArray.add("yee4");
     dynamicArray.add("yee4");
     dynamicArray.add("yee4");
    
   
    System.out.println(dynamicArray.search("yee3"));
    dynamicArray.insert(2, "xxxxx");
    dynamicArray.toString();

   }
}
