package input;

public class HighOrLowInput extends StringInput {
    private HighOrLow answer = null;
    
    public HighOrLow getAnswer() {
        return this.answer;
    }
    
    public void inputValue() {
        this.answer = null;
        super.inputValue();
        
        if (this.getValue().equals(HighOrLow.HIGH.getKey())) {
            this.answer = HighOrLow.HIGH;
        }
        
        if (this.getValue().equals(HighOrLow.LOW.getKey())) {
            this.answer = HighOrLow.LOW;
        }
    }
}
