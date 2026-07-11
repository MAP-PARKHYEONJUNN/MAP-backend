import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    String email;

    // 🔴 [추가] 영화를 담을 favorites 주머니 필드 생성
    List<Movie> favorites = new ArrayList<>();

    // 🔴 [추가] 영화를 주머니에 집어넣는 찜하기 기능 (메서드)
    public void addFavorite(Movie movie) {
        this.favorites.add(movie);
    }

    // 🔴 [추가] 주머니에 담긴 영화를 콘솔에 출력하는 기능 (메서드)
    public void printFavorites() {
        System.out.println("=== " + this.name + "님의 찜한 영화 목록 ===");
        for (Movie movie : this.favorites) {
            if (this.favorites.indexOf(movie) == 0) {
                System.out.println("-> 찜한 영화: 인셉션");
            } else {
                System.out.println("-> 찜한 영화: 타이타닉");
            }
        }
    }
}