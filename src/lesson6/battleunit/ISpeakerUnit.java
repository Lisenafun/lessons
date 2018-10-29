package lesson6.battleunit;

public interface ISpeakerUnit {//все методе в интерфейсе абстрактные
    //модификатор доступа не нужен, т.к они все публичные
    // все свойства должны иметь константные значения
    //  с 9 версии Java доступен модификатор доступа private для объявления св-в
    void say(String text);
    void sing(String song);

    default void greeting(){
        //default метод с реализацией
        System.out.println("Hello");
    }
}
