
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. 유저 객체 생성 및 정보 세팅
        User user = new User();
        user.name = "홍길동";
        user.email = "hong@test.com";

        // 2. 찜할 영화 객체들 생성
        Movie movie1 = new Movie("인셉션", "SF", 2010);
        Movie movie2 = new Movie("타이타닉", "로맨스", 1997);

        // 3. 유저 필드 메서드를 사용하여 영화 찜하기
        user.addFavorite(movie1);
        user.addFavorite(movie2);

        // 4. 유저 필드 메서드로 찜 목록 바로 출력하기
        user.printFavorites();
    }
}