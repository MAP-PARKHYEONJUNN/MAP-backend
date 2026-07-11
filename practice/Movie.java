public class Movie {
    // 접근 제어자 private 적용
    private String title;
    private String genre;
    private int releaseYear;

    // 생성자 (Constructor)
    public Movie(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }
}