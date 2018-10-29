package lesson4;

import java.util.Arrays;

public class Storage {
    private int size = 3;
    private Good [] goods1 = new Good[size];
    public void addGood(Good good){
        for (int i = 0; i < this.goods1.length; i++) {
            if (goods1[i] == null){
                goods1[i] = good;
                return;
            }
        }
        System.out.println("Места нет");
    }
    public void showGoods(){
        System.out.println(Arrays.toString(goods1));
    }
}
