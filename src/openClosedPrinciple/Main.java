package openClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        SorterManager sorterManager = new SorterManager();
        sorterManager.sort(new InsertionSort());
        sorterManager.sort(new Mergesort());
        sorterManager.sort(new Quicksort());
    }
}
