package lesson3;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        // Arrays - класс для работы с массивами.
        int [] arr;// объявление переменной массива
        int arr1 [];// объявление переменной массива, более частое использование
        arr = new int[10];//длина массива в квадратных скобках, длина не изменна.
        System.out.println(Arrays.toString(arr));// имякласса.метод(массив)
        System.out.println(arr.length);//узнать длину массива

        int a = 90;
        int arr3 [] = {2, 4, 8, 45, 15, a};
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3.length);

        System.out.println(arr3[2]); //8
        System.out.println(arr3[2+2]); //15
//        System.out.println(arr3[7]);//ArrayIndexOutOfBoundsException

        arr3[1] = 123;//изменение значения элемента
        System.out.println(Arrays.toString(arr3));

        arr[0] = 34;
        arr[1] = 23;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 10;
        }
        System.out.println(Arrays.toString(arr));

        //копирование массива
        int[] arr4 = {2,4,8,7,5,8};
        int[] arr5 = arr4;//остается один массив и 2 ссылки на один массив

        int[] cloneArr4 = arr4.clone(); //создает полную копию массива
/*        System.arraycopy(srcArr, int srcPos,
                           destArr, int destPos,
                           int length);*/
        int[] arr6 = new int[6];
        System.arraycopy(arr4, 0, arr6, 2, 4);
        System.out.println(Arrays.toString(arr6));// [0, 0, 4, 0, 0, 0, 0, 0, 0, 0]

        int[] copyArr4 = Arrays.copyOf(arr4,10);
        System.out.println(Arrays.toString(copyArr4));
//        {2,4,8,7,5,8};
        int [] copyRangeArr4 = Arrays.copyOfRange(arr4,1,3); // 4.8.
        System.out.println(Arrays.toString(copyRangeArr4));

        // перебор значений массива в цикле
        arr4 = new int[]{2,4,8,7,5,8,38,4};
        for (int i = 0; i < arr4.length; i++) {
            arr4[i]+= 100;
        }
        System.out.println(Arrays.toString(arr4));

        for (int num: arr4) {
            System.out.println("num = " + num);
//            num += 100; воспользоваться значением, но не изменить
        }
        System.out.println(Arrays.toString(arr4));

        // сравнение массивов
        arr4 = new int[]{2,4,8,7,5,8,38,4};
        arr5 = new int[]{2,4,8,7,5,8,38,4};

        System.out.println(arr4 == arr5); // false
        System.out.println(arr4.equals(arr5)); // false
        System.out.println(Arrays.equals(arr4, arr5)); // true

        int[] arr7 = new int[14];
        Arrays.fill(arr7, 233);
        System.out.println(Arrays.toString(arr7));

        arr7 = new int[]{34, 5, 8 , 10, -5};
        Arrays.sort(arr7,3,4);
        System.out.println(Arrays.toString(arr7));
        Arrays.sort(arr7);
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.binarySearch(arr7, 3));

    }
}
