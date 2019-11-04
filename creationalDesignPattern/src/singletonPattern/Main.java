package singletonPattern;

/**
 *
 *  Singleton Pattern -> restricts the instantiation of a class to one object
 *      This is useful when exactly one object is needed to coordinate actions across the system
 *
 *              ~for example: we need just single database instance !!!
 *
 * */

public class Main {
    public static void main(String[] args) {
        Downloader d = Downloader.getInstance();
        d.startDownloading();

        Downloader d2 = Downloader.getInstance();
        d2.startDownloading();

        // Easy way Singleton pattern
        SingletonClass.INSTANCE.setCounter(10);
        System.out.println(SingletonClass.INSTANCE.getCounter());
    }
}
