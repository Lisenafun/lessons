package lesson6.Calculator;

public class Minus extends Operation {
    @Override
    public void execute() {
        double sum1 = getA() - getB();
        System.out.println(getA() + " - " + getB() + " = " + sum1);
    }

    public Minus(double a, double b) {
        super(a, b);
    }
}
