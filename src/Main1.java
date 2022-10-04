public class Main1 {

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println(" Установите версию приложения для IOS по ссылке ");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке ");

        }
        System.out.println(" ЗАДАНИЕ 2 ");

        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите  версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите  версию приложения для iOS по ссылке ");

            if (clientDeviceYear < 2015 && clientOs == 1) {
                System.out.println(" Установите облегченную версию приложения для IOS по ссылке ");
            } else {
                System.out.println("Установите облегченную  версию приложения для Android по ссылке ");

                if (clientDeviceYear >= 2015 && clientOs == 0) {

                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите  версию приложения для iOS по ссылке ");
                }
                if (clientDeviceYear < 2015 && clientOs == 0) {
                    System.out.println(" Установите  облегченную версию приложения для IOS по ссылке ");
                } else {
                    System.out.println("Установите  облегченную версию приложения для Android по ссылке ");
                }}
        }System.out.println(" ЗАДАНИЕ 3 ");
        int year=2021;
        if(year % 4==0 && year % 100!=0 || year %400==0){
            System.out.println( + year + " год является высокостным");
        } else {
            System.out.println( + year + " год не является высокостным");
        } System.out.println(" ЗАДАНИЕ 4 ");
        int  deliveryDistance=95;
        int deliveryDays=1;
        if( deliveryDistance>20){
            deliveryDays++;
        }if(deliveryDistance>60) {
            deliveryDays++;
        } System.out.println( " Потребуется дней" + deliveryDays);

        System.out.println(" ЗАДАНИЕ 4 ");
        int monthNumber = 12;
        switch (monthNumber  ){
            case 12:
            case 1:
            case 2:
                System.out.println( " зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println( " весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println( " лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println( " осень ");
            default:
                System.out.println( " Некорректный месяц " + monthNumber);
        }




    }
}