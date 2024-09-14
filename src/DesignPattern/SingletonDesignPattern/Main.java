package DesignPattern.SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
//        DesignPattern.SingletonDesignPattern.Singleton singletonInstance = DesignPattern.SingletonDesignPattern.Singleton.getInstance();
//        singletonInstance.showMessage();
        System.out.println("Hello world!");

        Thread[] threads = new Thread[10];

        for(int i=0; i<threads.length; i++){
            threads[i] = new Thread(() -> {
                Singleton singletonInstance = Singleton.getInstance();
                singletonInstance.showMessage();
            }) ;
        }

        for(Thread thread : threads){
            thread.start();
        }

        for(Thread thread : threads){
            try{
                thread.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}