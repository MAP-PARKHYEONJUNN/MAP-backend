public class Store {
    // 1. 필드 (전부 private)
    private Long storeId;
    private String name;
    private String address;

    // 2. 생성자
    public Store(Long storeId, String name, String address) {
        this.storeId = storeId;
        this.name = name;
        this.address = address;
    }

    // 3. getter
    public Long getStoreId() {
        return storeId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}