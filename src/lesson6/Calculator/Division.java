package lesson6.Calculator;

public class Division extends Operation{

    public Division(double a, double b) {
        super(a, b);
    }

    @Override
    public void execute() {
        if(getB() == 0){
            System.out.println("Деление на ноль невозможно");
        } else {
            double sum1 = getA() / getB();
            System.out.println(getA() + " : " + getB() + " = " + sum1);
        }
    }
}
