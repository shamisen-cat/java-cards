package input;

public enum HighOrLowEnum {
    HIGH("h"),
    LOW("l");
    
    private final String KEY;
    
    private HighOrLowEnum(String key) {
        this.KEY = key;
    }
    
    public String getKey() {
        return this.KEY;
    }
}
