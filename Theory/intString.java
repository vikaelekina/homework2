package Theory;

public class intString {
    public static void main(String[] args) {
        // Примитивные типы данных


        int myInt = 10;
        int myInt2;
        myInt2=20;
        System.out.println(myInt);
        // short от -32000 до 32000
        short myShort = 32000;
        long myLong=60000;
        // double для вещественных чисел
        double myD = 20.1;
        //float нужно явно указывать в коде - ставить f в конце
        float myF=23.1f;
        char c = 'a';
        boolean t = true;
        // от -128 до 128
        byte  b = 123;

        // Ссылочные типы данных
        String s = "Hello";

        //форматирование строк
        String space = " ";
        String name = "Bob";
        System.out.println(s+space+name);

    }
}
