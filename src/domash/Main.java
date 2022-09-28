package domash;

public class Main{

public static void main(String[]args){
    System.out.println("задание 1");
    int age=17;
    if(age ==18){
        System.out.println( " Поздровляем с совершеннолетием");}
        if(age<18){
            System.out.println( " вам еще нужно немного подождать");
        }
        // задание 2
     System.out.println( "задание 2");
        if(age>=7){
            System.out.println( "посещает школу");}
            if(age>=18){
                System.out.println( " Окончание школы,поступление в университет");

            } if(age>=24){
                System.out.println( "Окончание университета и поиски работы");

    }

          //задание 3
    System.out.println( " Задание 3 ");
            int places=102;
            int seating=60;
            int standing= places-seating;
            int totalPass=25;
           if( totalPass<=seating){
               System.out.println( "пассажиров если зайдет"+totalPass+" человека , то сидячих мест останется"+(seating-totalPass));
            } if( totalPass>=standing ){
               if (totalPass >seating)
               if (totalPass<places)
                   System.out.println( " Если пассажиров зайдет"+ totalPass+ "человек, то останется " +(seating-(totalPass-standing))+" стоячих мест ");
    } if ( totalPass>=places){
               System.out.println(" Если пассажиров зайдет " + totalPass+ " человека , то мест в вагоне не останется .");}






}



}





























































































