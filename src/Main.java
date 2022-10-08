public class Main {
    public static void main(String[] args) {
        //задание1
        System.out.println(" задачка 1 ");

        int i = 557;
        short s = 3200;
        long log = 262464L;

        float fl = 2362.4f;
        double d = 235.35;

        char a = 'a';
        boolean b = true;

        byte e = 100;
        System.out.println(i + "/n" + s + "/n" + log + "/n" + fl + "/n" + d + "/n" + a + "/n" + b + "/n" + e + "/n");


        // задание 2
        System.out.println(" задачка 2 ");
        double de = 27.12;
        System.out.println(de);
        long l = 987678965549L;
        System.out.println(l);
        byte by = 2;
        System.out.println(by);
        short sh = 786;
        System.out.println(sh);
        int age = 22;
        boolean isAdult = age >= 18;
        System.out.println(age);
        short s1 = 569;
        System.out.println(s1);
        short s2 = -159;
        System.out.println(s2);
        long l1 = 27897L;
        System.out.println(l1);
        byte b1 = 67;
        System.out.println(b1);


        // задание 3
        System.out.println(" задачка 3 ");
        int ljudmila = 23;
        int anna = 27;
        int katja = 30;
        int paperSheets = 480 / (ljudmila + anna + katja);
        System.out.println(" на каждого ученика рассчитано  " + paperSheets + "листов");

        // задание 4

        System.out.println(" задачка 4 ");

        var dveMinuty = 16;
        var odnaMinuty = dveMinuty / 2;
        System.out.println(" за одну минуту выпускает " + odnaMinuty + " штук");
        var dwadzatMinuty = odnaMinuty * 20;
        System.out.println(" за двадцать минут " + dwadzatMinuty + " штук ");
        var hour = 60;
        var sutki = hour * 24;
        System.out.println(" в сутки выпускает " + sutki + " штук ");
        var threeDays = sutki * 3;
        System.out.println(" за трое суток выпускает " + threeDays + " штук ");
        var month = sutki * 30;
        System.out.println(" за месяц  выпускает " + threeDays + " штук ");

        // задача 5
        System.out.println(" задачка 5 ");

        int white = 2;
        int brown = 4;
        int cans = 120;
        var roomAmount = cans / (white + brown);
        System.out.println("В школе , где %s классов,нужно %d банок белой краски и %d банок коричневой краски /n " + roomAmount + " классов " + roomAmount * white + "белой краски " + roomAmount * brown + " коричневой");

        // задание 6
        System.out.println(" задачка 6");

        float gramsInKg = 1000;
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int bananaAmout = 5;
        int milkAmout = 2;
        int iceCreamAmout = 2;
        int eggAmout = 4;
        int result = (bananaWeight * bananaAmout) + (milkWeight * milkAmout) + (iceCreamWeight * iceCreamAmout) + (eggWeight * eggAmout);
        float resultInKg = result / gramsInKg;
        System.out.println(milkAmout + "" + 100f);

        // задачка 7

        System.out.println(" задачка 7 ");
        int needToLoseKgs = 7;
        int gramsInKilogram = 1000;
        int needToLoseGs = needToLoseKgs * gramsInKilogram;
        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;
        int minDay = needToLoseGs / maxGramsPerDay;
        int minDay1 = needToLoseGs / minGramsPerDay;
        System.out.println("500гр за  " + minDay + " дней " + " 250 гр" + minDay1 + " дней ");

        // задачка 8
        System.out.println(" задачка 8 ");
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_320;
        int percent = 10;
        float newSalaryMultiplier = 1 + (percent / 100f);
        float mashaNewSalary = mashaSalary * newSalaryMultiplier;
        float mashaTotalSalaryDiff = (mashaNewSalary - mashaSalary) * 12;
        float denisNewSalary = denisSalary * newSalaryMultiplier;
        float denisTotalSalaryDiff = (denisNewSalary - denisSalary) * 12;
        float kristinaNewSalary = kristinaSalary * newSalaryMultiplier;
        float kristinaTotalSalaryDiff = (kristinaNewSalary - kristinaSalary) * 12;
        System.out.println("маша теперь получает" + mashaNewSalary + ". " + "годовой доход вырос на " + mashaTotalSalaryDiff + "рублей");
        System.out.println("денис теперь получает" + denisNewSalary + ". " + "годовой доход вырос на " + denisTotalSalaryDiff + "рублей");
        System.out.println("кристина теперь получает" + kristinaNewSalary + ". " + "годовой доход вырос на " + kristinaTotalSalaryDiff + "рублей");












































    }

}