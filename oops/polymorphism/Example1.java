package oops.polymorphism;

public class Example1 {

    public static void main(String[] args) {
        var e = new Example1().new Cal();
        // Method Overloading
        System.out.println(e.sum(1,1));
        System.out.println(e.sum(1.00,1.00));

        // Method Overriding
        System.out.println(e.multi(1,1));
    
    }


    public class Cal0 {
        public int multi(int n1, int n2) {
            return n1 * n2;
        }
    }

    public class Cal extends Cal0 {
    
        public int sum(int a, int b) {
            return a + a;
        }
    
        public double sum(double num1, double num2) {
            return num1 + num2;
        }

        @Override
        public int multi (int num1, int num2) {
            return num1 * num2;
        }
        
    }

    
}
