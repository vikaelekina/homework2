package Theory;

public class Begin {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        int years1 = person1.calculateYearsToRetirement();
        System.out.println(years1);
        //       person1.speak();

        Person person2 = new Person();
        person2.name = "Олег";
        person2.age = 30;
        int years2 = person2.calculateYearsToRetirement();
        System.out.println(years2);

//        person2.sayHello();
    }
}

class Person {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + " мне " + age + " лет");
        }
    }

    void sayHello() {
        System.out.println("Привет!");
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }
}
