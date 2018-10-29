package lesson6.Calculator;

public class Multiplication extends Operation {

    public Multiplication(double a, double b) {
        super(a, b);
    }

    @Override
    public void execute() {
        double sum1 = getA() * getB();
        System.out.println(getA() + " * " + getB() + " = " + sum1);
    }
}
