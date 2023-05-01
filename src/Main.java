public class Main {
    public static void main(String[] args) {

        int beg = 700;          //начальная сумма на счете
        int plus = 1229;        //сумма пополнения
        int bonus = 0;

        if (plus > 1000) {
            bonus = plus / 100;
        }

        int end = beg + plus + bonus;       //итоговая сумма с учетом бонусов

        System.out.println(" Поздравляем! Вам начислены бонусы в размере " + bonus + " руб. ");
        System.out.println(" Сумма на Вашем счёте " + end + " руб. ");
    }

}

