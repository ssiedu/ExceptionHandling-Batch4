public class FinallyExample {
    public static void main(String[] args) {
        System.out.println("Begin-of-Program................");
        int n1 = 0, n2 = 0, res = 0;
        try {
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
            res = n1 / n2;
            System.out.println("Try Completed...");
        }catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("Invalid Inputs........");
        }finally{
            System.out.println("Inside Finally Block...(Always Run..)");
        } 
        

        System.out.println("Result : " + res);
        System.out.println("End-of-Program..................");
    }
}
