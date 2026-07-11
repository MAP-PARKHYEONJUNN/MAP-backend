
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Movie 객체들을 담을 리스트 생성
        ArrayList<Movie> movieList = new ArrayList<>();

// 2. Movie 객체 생성 (마지막에 개봉연도 '숫자'를 추가해 줍니다!)
        Movie movie1 = new Movie("인셉션", "SF", 2010);
        Movie movie2 = new Movie("타이타닉", "로맨스", 1997);

        // 3. 리스트에 영화 추가
        movieList.add(movie1);
        movieList.add(movie2);

        // 4. 콘솔 출력 테스트하기
        System.out.println("--- 영화 목록 출력 ---");
        for (Movie movie : movieList) {
            // title을 직접 부르지 않고 객체를 통째로 출력합니다!
            System.out.println(movie);
        }
    }
}