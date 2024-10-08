package input;

public enum HighOrLow {
    HIGH("h"),
    LOW("l");
    
    private final String KEY;
    
    private HighOrLow(String key) {
        this.KEY = key;
    }
    
    public String getKey() {
        return this.KEY;
    }
}
