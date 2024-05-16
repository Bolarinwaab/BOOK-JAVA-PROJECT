class Book {
    private String title;
    private String author;
    private String ISBN;
    private String publisher;
    private int releaseYear;

    public Book(String title, String author, String ISBN, String publisher, int releaseYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Publisher: " + publisher
                + ", Release Year: " + releaseYear;
    }
}