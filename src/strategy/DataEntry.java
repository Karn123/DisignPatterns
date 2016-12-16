package strategy;

import java.util.Scanner;

/**
 * Created by Karn on 2016/12/6.
 */
public class DataEntry {
    private ValidationType validationType;
    public ValidationType getValidationType() {
        return validationType;
    }

    public void setValidationType(ValidationType validationType) {
        this.validationType = validationType;
    }
    public void interact(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Prompt:");
        String s = scanner.next();
        this.validationType.validateType(s);
    }
}