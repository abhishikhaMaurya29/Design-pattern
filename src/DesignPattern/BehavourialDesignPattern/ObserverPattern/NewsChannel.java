package DesignPattern.BehavourialDesignPattern.ObserverPattern;

public class NewsChannel implements Observer{
    String news;
    String id;

    public NewsChannel(String id){
        this.id = id;
    }
    @Override
    public void update(String news) {
        this.news = news;
        displayNews();
    }

    private void displayNews() {
        System.out.println(id + " " + news);
    }
}
