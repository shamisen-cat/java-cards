package test;

import input.HighOrLowEnum;
import input.HighOrLow;

public class HighOrLowTest {
    public static void main(String[] args) {
        HighOrLowEnum HIGH = HighOrLowEnum.HIGH;
        HighOrLowEnum LOW = HighOrLowEnum.LOW;
        
        String high = HIGH.getKey() + ": " + HIGH;
        String low = LOW.getKey() + ": " + LOW;
        
        System.out.println("Checking the enum settings.");
        System.out.println(high);
        System.out.println(low);
        
        System.out.println("Check the operation of HIGH or LOW input.");
        HighOrLow highOrLow = new HighOrLow();
        
        while (true) {
            System.out.println(
                  "Please enter '" + HIGH.getKey() + "' or '" + LOW.getKey()
                + "' (" + high + ", " + low + ")"
            );
            System.out.print("> ");
            
            highOrLow.inputValue();
            
            if (highOrLow.getAnswer() != null) {
                break;
            }
        }
        
        System.out.println("answer: " + highOrLow.getAnswer());
        System.out.println("End of processing.");
    }
}
