package DesignPattern.BehavourialDesignPattern.ObserverPattern;

public class Application {
    public static void main(String[] args){
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel newsChannel1 = new NewsChannel("channel1");
        NewsChannel newsChannel2 = new NewsChannel("channel2");

        newsAgency.addObserver(newsChannel1);
        newsAgency.addObserver(newsChannel2);

        newsAgency.setNews("Java 17 version is released");
    }
}
