package oops.abstraction;

abstract class Abs {
    
    public void process() {
        step1();
        step2();
    }

    public abstract void step1();
    
    public abstract void step2();
}
