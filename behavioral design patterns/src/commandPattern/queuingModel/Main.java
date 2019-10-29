package commandPattern.queuingModel;

/**
 *
 *  Commands package a piece of computation ... this computation may be invoked long after
 *  the command objects are created
 *
 *      - It can be invoked by different threads !!!
 *      - Schedulers, thread pools, job queues ...
 * */

public class Main {
    public static void main(String[] args) {
        final Algorithm algorithm = new Algorithm();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                algorithm.produce();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                algorithm.consume();
            }
        });

        t1.start();
        t2.start();

    }
}
