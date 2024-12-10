package Homework1;

public class Homework1 {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.quantity = 10;
        product1.cost = 12.568;
        product1.discount = 0.75;
        product1.calculateSumPurchase();

        Product product2 = new Product();
        product2.quantity = 15;
        product2.cost = 87.568;
        product2.discount = 42.575;
        product2.calculateSumPurchase();

        Product product3 = new Product();
        product3.quantity = 20;
        product3.cost = 785.94;
        product3.discount = 59.1;
        product3.calculateSumPurchase();
    }
}

class Product {
    /*
    Принимает на вход количество товара, цену товара, скидку на товар.
    С помощью метода calculateSumPurchase() может подсчитывать сумму покупки со скидкой и без скидки
     */
    int quantity;//Количество товара - целочисленное значение
    double cost;//Цена товара - вещественное значение
    double discount;//Скидка на товар- вещественное значение,

    void calculateSumPurchase() {
        double sumPurchase = (double) Math.round(quantity * cost * 100) / 100;
        double sumPurchaseWithDiscount = (double) Math.round(quantity * cost * (100 - discount)) / 100;
        System.out.println("Сумма покупки без скидки: " + sumPurchase);
        System.out.println("Сумма покупки со скидкой: " + sumPurchaseWithDiscount);
    }
}
