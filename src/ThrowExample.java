public class ThrowExample {
 public static void main(String[] args) {
        System.out.println("Begin-of-Program................");
        int n1 = 0, n2 = 0, res = 0;
        try {
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
            
            if(n2>n1){
                //if yes,then we will throw ArithmeticException
                ArithmeticException ob=new ArithmeticException();
                throw ob;
            }
            
            res = n1 / n2;
            System.out.println("Try Completed...");
        }catch (ArithmeticException  e) {
            System.out.println("Arithmetic Exception Handled ........");
            res = n1/2;
        }

        System.out.println("Result : " + res);
        System.out.println("End-of-Program..................");
    }    
}
