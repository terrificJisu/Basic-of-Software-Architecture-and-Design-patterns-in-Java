package templatePattern;

/**
 *
 *  In Template pattern, an abstract class exposes defined way /  template to execute its methods
 *
 *  Its subclasses can override the method implementation as per need but the invocation
 *  is to be in the same way as defined by an abstract class
 *
 *  abstract class Game() {
 *      abstract void initialize();
 *      abstract void startGame();
 *      abstract void finishGame();
 *  }
 *
 * */

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,5,3,8,2,-2,10};

        Algorithm sortAlgorithm = new BubbleSort(numbers);
        sortAlgorithm.sort();
    }
}
