class Book extends Item {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + (isRented ? " (Rented)" : " (Available)");
    }
}



