public class Song {
    private String title;
    private String autor;
    private String text;

    public Song(String title, String autor, String text) {
        this.title = title;
        this.autor = autor;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
