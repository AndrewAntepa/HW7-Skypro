import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int total = 0;
        int countMonths = 0;
        int savingsPerMonth = 15000;
        while (total <= 2459000){
            total += total / 100;
            total += savingsPerMonth;
            System.out.println("Месяц " + ++countMonths + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("\nЗадание 2");
        int i = 1;
        while (i < 11){
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадание 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (int year = 1; year <= 10; year++) {
            int births = (population * birthRate) / 100;
            int deaths = (population * deathRate) / 100;
            population += (births - deaths);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println("\nЗадание 4");
        total = 15000;
        countMonths = 0;
        while (total <= 12000000){
            total += total / 100 * 7;
            total += savingsPerMonth;
            System.out.println("Месяц " + ++countMonths + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("\nЗадание 5");
        total = 15000;
        countMonths = 1;
        while (total <= 12000000){
            total += total / 100 * 7;
            total += savingsPerMonth;
            if(countMonths % 6 == 0) {
                System.out.println("Месяц " + countMonths + ", сумма накоплений равна " + total + " рублей");
            }
            countMonths++;
        }

        System.out.println("\nЗадание 6");
        total = 15000;
        countMonths = 1;
        for (int j = 0; j <= 9 * 12; j++) {
            total += total / 100 * 7;
            total += savingsPerMonth;
            if (countMonths % 6 == 0) {
                System.out.println("Месяц " + countMonths + ", сумма накоплений равна " + total + " рублей");
            }
            countMonths++;
        }

        System.out.println("\nЗадание 7");
        Scanner scanner = new Scanner(System.in);
        int firstFridayInMonth = scanner.nextInt();
        while (firstFridayInMonth <= 31){
            System.out.println("Сегодня пятница, " + firstFridayInMonth + "-е число. Необходимо подготовить отчет");
            firstFridayInMonth += 7;
        }

        System.out.println("\nЗадание 8");
        int year = 1824;
        int yearsEnd = 2224;
        while (year <= yearsEnd){
            if(year % 79 == 0){
                System.out.println(year);
            }
            year++;
        }
    }
}