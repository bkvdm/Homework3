// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1 ");
        byte b = 127;
        short s = 32_767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;
        float f = 3.4f;
        double d = 1.7;
        System.out.println("Значение переменной с типом byte равно " + b);
        System.out.println("значение переменной с типом short равно " + s);
        System.out.println("значение переменной с типом int равно " + i);
        System.out.println("значение переменной с типом long равно " + l);
        System.out.println("значение переменной с типом float равно " + f);
        System.out.println("значение переменной с типом double равно " + d);
    }
    public static void task2 () {
        System.out.println("Задача 2 ");
        float f = 27.12f;
        long l = 987_678_965_549L;
        double d = 2.786;
        short s = 569;
        short s1 = -159;
        int i = 27897;
        byte b = 67;
        System.out.println("Переменные заданы. По условиям задачи, их значения в консоль выводить не нужно");
    }
    public static void task3 () {
        System.out.println("Задача 3 ");
        byte luda = 23;
        byte anna = 27;
        byte katya = 30;
        short bumaga = 480;
        int otvet = 0;
        otvet = otvet + bumaga / (luda + anna + katya);
        System.out.println("На каждого ученика рассчитано " + otvet + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4 ");
        byte bottleBase = 16;
        byte timeBase = 2;
        int proizv = 0;
        short minuteDay = 24 * 60;
        int minute = 0;
        int timeWork = 0;
        short oneDay = 0;
        timeWork = timeWork + 20;
        proizv = timeWork * (bottleBase / timeBase);
        System.out.println("За " + timeWork + " минут, машина произвела " + proizv + " штук бутылок");
        timeWork = minuteDay;
        proizv = timeWork * (bottleBase / timeBase);
        System.out.println(("За " + (timeWork / minuteDay) + " сутки, машина произвела " + proizv + " штук бутылок"));
        timeWork = minuteDay * 3;
        proizv = timeWork * (bottleBase / timeBase);
        System.out.println("За " + (timeWork / minuteDay) + " сутки, машина произвела " + proizv + " штук бутылок");
        timeWork = minuteDay * 30;
        proizv = timeWork * (bottleBase / timeBase);
        System.out.println("За " + ((timeWork / minuteDay) / 30) + " месяц, машина произвела " + proizv + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5 ");
        int allklassov = 0;
        byte allbanok = 120;
        byte onewhite = 2;
        byte onebraun = 4;
        int allwhite = 0;
        int allbraun = 0;
        allklassov = allklassov + allbanok / (onewhite + onebraun);
        allwhite = onewhite * allklassov;
        allbraun = onebraun * allklassov;
        System.out.println("В школе, где " + allklassov + " классов, нужно " + allwhite + " банок белой краски и " + allbraun + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6 ");
        byte vesbanana = 80;
        float vesmilk = 200 * 105 / 100;
        byte snow = 100;
        byte egg = 70;
        float vesbreakfast = 0;
        vesbreakfast = vesbreakfast + vesbanana * 5 + vesmilk * 1 + snow * 2 + egg * 4;
        System.out.println("Вес завтрака спортсмена " + vesbreakfast + " грамм или " + vesbreakfast / 1000 + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7 ");
        short veslost = 7000;
        short minlost = 250;
        short maxlost = 500;
        int day = 0;
        day = day + ((veslost / minlost + veslost / maxlost)/2);
        System.out.println("В среднем при таком рационе для потери " + veslost / 1000 + " кг, спортсмен сбросит за " + day + " дней");
        System.out.println("Если спортсмен будет терять " + minlost + " грамм в день, тогда он сбросит " + veslost / 1000 + " кг за " + veslost / minlost + " дней");
        System.out.println("Если спортсмен будет терять " + maxlost + " грамм в день, тогда он его сбросит за " + veslost / maxlost + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8 ");
        float profitMasha = 67_760 * 12;
        float profitDenis = 83_690 * 12;
        float profitKristina = 76_230 * 12;
        System.out.println("Маша теперь получает " + profitMasha * 1.10 + " рублей в год. Годовой доход вырос на " + (profitMasha * 1.10 - profitMasha) + " рублей");
        System.out.println("Денис теперь получает " + profitDenis * 1.10 + " рублей в год. Годовой доход вырос на " + (profitDenis * 1.10 - profitDenis) + " рублей");
        System.out.println("Кристина теперь получает " + profitKristina * 1.10 + " рублей в год. Годовой доход вырос на " + (profitKristina * 1.10 - profitKristina) + " рублей");
    }
}
