package input;

public class HighOrLow extends StringInput {
    private HighOrLowEnum answer = null;
    
    public HighOrLowEnum getAnswer() {
        return this.answer;
    }
    
    public void inputValue() {
        HighOrLowEnum HIGH = HighOrLowEnum.HIGH;
        HighOrLowEnum LOW = HighOrLowEnum.LOW;
        
        super.inputValue();
        
        HighOrLowEnum answer = null;
        
        if (this.getValue().equals(HIGH.getKey())) {
            answer = HIGH;
        }
        
        if (this.getValue().equals(LOW.getKey())) {
            answer = LOW;
        }
        
        this.answer = answer;
    }
}
