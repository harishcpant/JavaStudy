package ExceptionHandling;

public class ThrowsExample {
    public static void main(String[] args)  {
        try{
            ThrowsExampleMethod();
        }catch(Exception e1){
            System.out.println("Throws exception handling..");
        }
    }

    public static void ThrowsExampleMethod() throws Exception {
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println("Valud of c is :- "+c);
    }
}
