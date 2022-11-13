public class Main {
    public static void main(String[] args) {
        // Задание 1.1
        int total = 0;
        int sum = 15000;
        int i = 0;
        while (total <= 2459000) {
            total = total + sum + (total / 100);
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        // Задание 1.2
        i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Задание 1.3
        int birth = 17;
        int death = 8;
        int population = 12000000;
        for (i = 1; i <= 10; i++) {
            population = population + (population / 1000 * (birth - death));
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
        // Задание 2.1
        sum = 15000;
        int interest = 7;
        for (i = 1; sum <= 12000000; i++) {
            sum = sum + sum / 100 * interest;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        // Задание 2.2-2.3
        sum = 15000;
        interest = 7;
        for (i = 1; i <= 9 * 12; i++) {
            sum = sum + sum / 100 * interest;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        // Задание 2.4
        int friday = 2;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        // Задание 3.1
        int yearNow = 2022;
        int yearBefore = yearNow - 200;
        int yearNext = yearNow + 100;
        for (int y = yearBefore; y <= yearNext; y++) {
            if (y % 79 == 0) System.out.println(y);
        }
        // Задание 3.2
        int number=2;
        for (int n=1;n<=10;n++){ int result= number*n;
            System.out.println(number+"*"+n+"="+result);
        }
    }
}