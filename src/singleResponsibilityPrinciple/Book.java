package singleResponsibilityPrinciple;

public class Book implements BookHandler{

    private int numOfPages;
    private String authorName;
    private BookPersistence bookPersistence;

    public Book(String authorName, int numOfPages) {
        this.authorName = authorName;
        this.numOfPages = numOfPages;
        this.bookPersistence = new BookPersistence();
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public void print() {
        System.out.println("Printing the book...");
    }

    @Override
    public void save() {
        this.bookPersistence.save(this);
    }

    @Override
    public String toString(){
        return authorName + " - " + numOfPages;
    }
}
