package input;

public class HighOrLowInput extends StringInput {
    private HighOrLowEnum answer = null;
    
    public HighOrLowEnum getAnswer() {
        return this.answer;
    }
    
    public void inputValue() {
        this.answer = null;
        super.inputValue();
        
        if (this.getValue().equals(HighOrLowEnum.HIGH.getKey())) {
            this.answer = HighOrLowEnum.HIGH;
        }
        
        if (this.getValue().equals(HighOrLowEnum.LOW.getKey())) {
            this.answer = HighOrLowEnum.LOW;
        }
    }
}
