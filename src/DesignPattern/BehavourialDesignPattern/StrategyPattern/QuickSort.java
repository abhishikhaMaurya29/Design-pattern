package DesignPattern.BehavourialDesignPattern.StrategyPattern;

public class QuickSort implements Sort{
    @Override
    public void sortBasedOnAlgorithm(int[] array) {
        System.out.println("Quick sort called");
    }
}
