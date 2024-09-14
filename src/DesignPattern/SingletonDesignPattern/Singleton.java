package DesignPattern.SingletonDesignPattern;

public class Singleton {
//    private static DesignPattern.SingletonDesignPattern.Singleton instance;
    private static volatile Singleton instance;
    // volatile keyword to the instance variable to ensure that changes are reflected to other thread's instance

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public void showMessage(){
        System.out.println("Hello, I am a DesignPattern.SingletonDesignPattern.Singleton instance!" + instance.hashCode());
    }
}
