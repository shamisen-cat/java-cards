package input;

import java.util.Scanner;

public class StringInput {
    private Scanner scanner;
    private String value = null;
    
    public StringInput() {
        scanner = new Scanner(System.in);
    }
    
    public String getValue() {
        return this.value;
    }
    
    public void inputValue() {
        this.value = null;
        this.value = scanner.nextLine();
    }
}
