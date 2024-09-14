package DesignPattern.BehavourialDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    String news;
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void setNews(String news){
        this.news = news;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for(Observer observer : observers){
            observer.update(news);
        }
    }
}
