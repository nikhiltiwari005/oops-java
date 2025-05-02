package oops.Inheritance;

public class Example1 {

    public static void main(String[] args) {
        System.out.println(new Example1().new CompositionExample(new Example1().new InnerClass2()).hello());
    }

    protected class InnerClass {
    
        protected String hi() {
            return "Hi from InnerClass";
        }
    }

    public class InnerClass2 extends InnerClass {

        public String hiFromBoth() {
            return hi() + ", Hi from InnerClass2.";
        }
    }

    public class CompositionExample {
        private InnerClass2 ic;
        // private InnerClass2 ic = new InnerClass2();

        CompositionExample(InnerClass2 ic) {
            this.ic = ic;
        }

        public String hello() {
            return ic.hiFromBoth();
        }
    }
    
}
