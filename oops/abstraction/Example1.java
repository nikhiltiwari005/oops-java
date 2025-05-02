package oops.abstraction;

public class Example1 extends Abs {

    public static void main(String[] args) {
        new Example1().process();
    }

    @Override
    public void step1() {
        // TODO Auto-generated method stub
        System.out.println(getClass());
        // throw new UnsupportedOperationException("Unimplemented method 'step1'");
    }

    @Override
    public void step2() {
        // TODO Auto-generated method stub
        System.out.println(getClass());
        // throw new UnsupportedOperationException("Unimplemented method 'step2'");
    }
    
}
