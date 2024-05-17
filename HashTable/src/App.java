import java.util.Hashtable;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) throws Exception {
        Hashtable<Integer,String> table = new Hashtable<>(10);

        table.put(100, "yee1");
        table.put(101, "yee2");
        table.put(102, "yee3");
        table.put(103, "yee4");
        table.put(104, "yee5");
        for (int key:table.keySet()) {
            System.out.println(table.get(key));
        }
    }
}
