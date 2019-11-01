package templatePattern;

public class BubbleSort extends Algorithm {

    private int[] numbers;

    public BubbleSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void initialize() {
        System.out.println("Initializing bubble sort...");
    }

    @Override
    public void sorting() {

        int n = this.numbers.length;
        int temp;

        while( n != 0 ) {
            temp = 0;

            for(int i=1; i<n; i++) {
                if(numbers[i-1] > numbers[i]) {
                    int swap = numbers[i-1];
                    numbers[i-1] = numbers[i];
                    numbers[i] = swap;
                    temp = 1;
                }
            }

            n = temp;
        }
    }

    @Override
    public void printResult() {
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
