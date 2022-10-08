public class Cikli2 {

    public static void main(String[] args) {

      int salari1=15000;
      int total1=0;
        int i=0;
        while (total1<=2_459_000){
            i++;
            total1=total1+total1/100;

            total1=total1  + salari1;
            System.out.println( "месяц " +i+ "  сумма накоплений равна  " + total1+ " рублей ");
        }

           System.out.println( total1);
           System.out.println( i);
           // задание 2

          System.out.println( " задание 2, циклы 2 ");
          int i1=0;
          while (i1<=9){
              i1++;
              System.out.print (i1);

          }System.out.println("");
        System.out.println( " задание 3, циклы 2 ");

          for ( int i2=10; i2 >=1;i2--){
              System.out.print(i2);
        }   System.out.println("");
          int population=12_000_000;
          int annualPopulation=(population*( 17-8 ))/1000;
          int a=1;
          for ( ; a<=10;a++){
              System.out.println( "Год " +a+ " численность населения составляет "+ annualPopulation);
          }
        System.out.println( " задание 2:1, циклы 2 ");

        int initialAmount=15_000;
        int month=0;
        while ( initialAmount<=12_000_000 ){
            initialAmount*=1.07;
            month++;

            System.out.println( "месяц " +month    +   "сумма накоплений равна  " + initialAmount+ " рублей ");
        }

        System.out.println( " задание 2:2, циклы 2 ");

        int initialAmount1=15_000;
        int monthh=1;
        for (; initialAmount1<=12_000_000 ;monthh++ ){
            initialAmount1*=1.07;
            if(monthh % 6==0){

                System.out.println("месяц "+ monthh   +    "сумма накоплений равна  " + initialAmount1 + " рублей ");}

        }   System.out.println( " задание 2:3, циклы 2 ");
        int sum=15000;
        for ( int I=1;I<108;I+=6){
            int sumBefore=sum;
            sum *=1+0.07*6;
            System.out.println("месяц "+ I  +    "сумма накоплений равна  " + sumBefore + " рублей ");

        }   System.out.println( " задание 2:4. циклы 2 ");

        int dayFriday=5;
          for ( int friday=dayFriday; friday<=31;friday+=7){
              System.out.println( "Сегодня пятница"   +  friday +  " число "+ "Необходимо подготовить отчет.");
          }

        System.out.println( " задание 3:1. циклы 2 ");
          int currenYear=2022;
          int pastYears=currenYear-200;
          int ragingYears=currenYear+100;
          for ( int e=pastYears; e < ragingYears; ++e){
              if ( e % 79==0){
                  System.out.println(e);
              }
          }
        System.out.println( " задание 3:2. циклы 2 ");
          for ( int si=1;si<10;si++){
              System.out.println( " 2*" + si+ " = " + 2*si);
          }













    }
}
