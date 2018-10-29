package lesson6.Calculator;

public class Main {
    public static void main(String[] args) {
        double a = 9;
        double b = 2;
        Operation plus = new Plus (a,b);
        plus.execute();
        Operation minus = new Minus (a,b);
        minus.execute();
        Operation division = new Division(a,b);
        division.execute();
        Operation multiple = new Multiplication(a,b);
        multiple.execute();
        /*LinkedList (самописный)

        List void add(Object obj, int index)
        void remove(int index)
        void get(int index) - возвращает элемент по индексу
        size - возвращает размер списка

        Stack
        pop() - удаляет только последний элемент
        push(Object obj) - элементы добавляются только в конец списка

        Queue
        unshift() - удаляет только первый элемент
        shift(Object obj) - добавляет элемент в начало списка

        LinkedList list = new LinkedList()
        list.add(Object obj, int index);
        list.remove(int index);
        list.get(int index);
        size - для всех;

      
         */
    }
}
