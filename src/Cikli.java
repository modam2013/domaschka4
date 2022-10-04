public class Cikli {


    public static void main(String[] args) {
        for ( int i = 1; i  <= 10; i ++) {
            System.out.println(" Интерация цикла " + i);
        }  for ( int i = 10 ;  i >=1;  i-- ){
            System.out.println( " Интерация цикла " + i );
        }
        for ( int i = 0; i<17; i=i+2){
            System.out.println( " Интерация цикла" +i);
        } for ( int i = 10; i>= - 10; i--){
            System.out.println( " Интерация цикла" +i);
        }

        System.out.println( " Задание 2 . Циклы   " );

        for ( int year = 1904; year<2096; year++){
            if( year%4==0 && year % 100 !=0 || year % 400==0)
            System.out.println( "  год является високосным " +year);
        }
        for ( int i = 7; i<99; i=i+7){
            System.out.print(  i +" ");


        }System.out.println( "  " );

           for (int i = 1; i<513; i=i*2) {
               System.out.print( i + " ");

            }System.out.println(" " );

            int salari=29000;
              int total=0;
              for ( int i =1;i<12;i++ ){
                  total=total + salari;
                  System.out.println( "месяц " +i+ "сумма накоплений равна  " + total+ " рублей ");
              }
             System.out.println( " Задание  . Циклы   " );

              int salari1=29000;
               int total1=0;
               for ( int i =1;i<12;i++ ){
                   total1=total1+total1/100;
            total1=total1  + salari1;
            System.out.println( "месяц " +i+ "сумма накоплений равна  " + total1+ " рублей ");
        }




    }
}
