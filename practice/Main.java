public class Main {
    public static void main(String[] args) {
        // 가게(Store) 객체 생성
        Store store = new Store(1L, "가게이름a", "서울시 강남구");

        // 미션(Mission) 객체 생성 (가게 객체를 인자로 넘겨 연결해 줍니다)
        Mission mission = new Mission(1L, "12,000원 이상 식사", store);

        // 결과 출력 확인: "가게이름a"가 정상 출력되어야 합니다.
        System.out.println(mission.getStore().getName());
    }
}