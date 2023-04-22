public class Main {
    public static void main(String[] args) {

        int beg = 695;          //начальная сумма на счете
        int plus = 1120;        //сумма пополнения

        if (plus > 1000) {
            plus = plus + (plus - 1000) / 100;
        }
        int end = beg + plus;       //итоговая сумма с учетом бонусов

        System.out.println(end);
    }
}
