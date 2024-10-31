import java.util.*;

abstract class Item {
    protected String title;
    protected String author;
    protected boolean isRented;

    public Item(String title, String author) {
        this.title = title;
        this.author = author;
        this.isRented = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rent() {
        isRented = true;
    }

    public void returnItem() {
        isRented = false;
    }

    public abstract String getType();
}

