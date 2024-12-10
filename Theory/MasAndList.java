package Theory;

import java.util.List;

public class MasAndList {
    public static void main(String[] args) {
        //Массив

        int[] numbers = new int[5];

        System.out.println(numbers[3]);

        for (int i = 0; i<5; i++){
            numbers[i]=i*10;
            System.out.println(numbers[i]);
        }

        int[] numbers2 = {1,2,3,4,5};
        for (int i = 0; i<5; i++){
            System.out.println(numbers2[i]);
        }

        //Динамический массив - ArrayList

        System.out.println("Динамический массив - ArrayList");

        List <Integer> list = new java.util.ArrayList<>();
        list.add(2);
        list.add(4);

        System.out.println(list.get(0));

        list.remove(1);

        for(int n:list){
            System.out.println(n);
        }

        boolean empty = list.isEmpty();
        System.out.println(empty);
        System.out.println(list.isEmpty());

    }
}
