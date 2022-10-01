

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("задание 1");
        int yarsOld = 15;
        if(yarsOld >=2 && yarsOld <=6){
            System.out.println( " Если возраст человека ," + yarsOld+ " то ему нужно ходить в детский сад");

        }else if(yarsOld >=7 && yarsOld <= 18){
            System.out.println( " Если возраст человека ," + yarsOld+ " то ему нужно ходить в школу");

        }else if(yarsOld >18 && yarsOld <=24){
            System.out.println( " Если возраст человека ," + yarsOld+ " то ему нужно ходить в университет");

        }else if (yarsOld>24){
            System.out.println( " Если возраст человека ," + yarsOld+ " то ему пора ходить на работу");
        }

        /// задание 2
        System.out.println( "задание 2");
          int age = 15;
          if(age<5){
              System.out.println( "Ваш возрост" + age + " года и пока вы не можете кататься на аттракционнах");

          } else if(age >=5 && age <=14){
              System.out.println( "Ваш возрост" + age + " лет,вы  можете кататься на аттракционнах , но в сопроваждении взрослых !");
          }else {
              System.out.println( " вы можете кататься на аттракционе");
          }

        /// задание 3
        System.out.println( " Задание 3 ");
          int oen=1;
          int two=2;
          int free=3;
          if(oen>two){
              if(oen>free){
                  System.out.println( " максимальное число" + oen);
              }


          }else if(free>oen){
              System.out.println( " максимальное число" + free);
          } else {
              System.out.println( " числа " + oen+ " и " + free + " равны");
          }  if( two>oen){
              if( two>free){
                  System.out.println( " максимально число " + two);
              } else if(free>two){
                  System.out.println( " максимальное число" + free);
              } else {
                  System.out.println( " числа " +two + " и " + free+ " равны");
              }  if(oen>free){
                  System.out.println( " максимальное число " + oen);
            } else if( free>oen){
                  System.out.println( " максимальное число " + free);
            }else {
                System.out.println( " числа " +oen + " и " + free+ " равны");
            }
        }

          }


}