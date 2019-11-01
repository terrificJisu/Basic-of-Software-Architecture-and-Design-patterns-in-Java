package templatePattern;

public class InsertionSort extends Algorithm {

    private int[] numbers;

    public InsertionSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void initialize() {
        System.out.println("Initializing insertion sort...");
    }

    @Override
    public void sorting() {

        int temp;
        int j;

        for(int i=1; i<this.numbers.length; i++) {
            temp = this.numbers[i];
            j=1;

            while (j>0 && numbers[j-1] > temp) {
                numbers[j] = numbers[j-1];
                j = j - 1;
            }

            numbers[j] = temp;
        }
    }

    @Override
    public void printResult() {
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
