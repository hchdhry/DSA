public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(power(3, 4));
        
    }

    public static int power( int num, int Exponent)
    {
       if (Exponent<1) return 1;
    
        return num* power(num,Exponent-1);
        

    }
    
}
