package ex1;

public class PriorityMain {

        public static void main(String[] args) {

            PriorityThread thread1 = new PriorityThread("min");
            PriorityThread thread2 = new PriorityThread("max");
            PriorityThread thread3 = new PriorityThread("norm"); //  create more threads and give them names according to priorities

            thread1.start();
            thread2.start();
            thread3.start(); //run threads
        }
    }
