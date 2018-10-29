package lesson6.Calculator;

public class Plus extends Operation{

    public Plus(double a, double b) {
        super(a, b);
    }

    @Override
    public void execute() {
        double sum1 = getA() + getB();
        System.out.println(getA() + " + " + getB() + " = " + sum1);
    }
}
