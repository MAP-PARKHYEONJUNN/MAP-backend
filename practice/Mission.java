public class Mission {
    // 1. 필드 (전부 private)
    private Long missionId;
    private String condition;
    private Store store; // Store 객체 참조 (DB의 FK 역할)

    // 2. 생성자
    public Mission(Long missionId, String condition, Store store) {
        this.missionId = missionId;
        this.condition = condition;
        this.store = store;
    }

    // 3. getter
    public Long getMissionId() {
        return missionId;
    }

    public String getCondition() {
        return condition;
    }

    public Store getStore() {
        return store;
    }
}