public class Test {
    public static void main(String[] args) {
        System.out.println("Begin-of-Program................");
        int n1 = 0, n2 = 0, res = 0;
        try {
            System.out.println("Now Converting 1st Value To Int...");
            n1 = Integer.parseInt(args[0]);
            System.out.println("Now Converting 2nd value to In....");
            n2 = Integer.parseInt(args[1]);
            System.out.println("Now Dividing 1st no by 2nd no....");
            res = n1 / n2;
        } catch (ArithmeticException e) {
            res = n1 / 2;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException  e) {
            System.out.println("Invalid Inputs........");
        } catch (Exception e) {
            System.out.println("Unknown Problem.......");
        }

        System.out.println("Result : " + res);
        System.out.println("End-of-Program..................");
    }
}
