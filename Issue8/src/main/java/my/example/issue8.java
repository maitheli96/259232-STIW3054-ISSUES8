package my.example;

public class issue8 {


        public static void main(String[]args){

            Thread t1 = new Thread(issue8::Thread1);

            Thread t2 = new Thread(issue8::Thread2);

            t1.start();

            t2.start();

        }



        public static void Thread1(){



            long start = System.currentTimeMillis();

            for(int i=0;i<10;i +=2){

                System.out.println(Thread.currentThread().getName()+ " Even "+i);



                try {

                    Thread.sleep(500);

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }}

            Long end = System.currentTimeMillis();

            System.out.println("execution time of even number "+(end - start) / 1000);

        }



        public static void Thread2(){



            long start = System.currentTimeMillis();

            for(int i=1;i<10;i +=2){

                System.out.println(Thread.currentThread().getName()+" odd "+i);



                try {

                    Thread.sleep(500);

                } catch(InterruptedException e){

                    e.printStackTrace();

                }}



            Long end = System.currentTimeMillis();

            System.out.println( "execution time of odd number "+(end - start) / 1000 );

        }

    }