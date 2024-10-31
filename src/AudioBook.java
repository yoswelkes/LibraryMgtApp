class AudioBook extends Item {
    public AudioBook(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "AudioBook";
    }

    @Override
    public String toString() {
        return "AudioBook: " + title + " by " + author + (isRented ? " (Rented)" : " (Available)");
    }
}