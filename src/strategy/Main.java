package strategy;

import java.util.Scanner;

/**
 * Created by Karn on 2016/12/6.
 */
public class Main {
    public static void main(String[] args) {
        DataEntry dataEntry = new DataEntry();
        System.out.println("Please input to choose an option n(number)/u(upper case)/l(lower case)/e(exit):");
        Scanner in = new Scanner(System.in);
        String string = in.next();
        while (!string.equals("e")) {
            ValidationType validationType = null;
            //After learning the factory design pattern, this part
            //can be done in a factory.
            switch (string) {
                case "n":
                    validationType = new Digit();
                    break;
                case "u":
                    validationType = new Upper();
                    break;
                case "l":
                    validationType = new Lower();
                    break;
                default:
                    break;
            }
            if (validationType == null) {
                System.out.println("Exception:Input error，Please input\"n\"(number) or \"u\"(upper case) or \"l\"(lower case) or \"e\"(exit)...");
            }
            else {
                dataEntry.setValidationType(validationType);
                dataEntry.interact();
            }
            System.out.println("Please input to choose an option n(number)/u(upper case)/l(lower case)/e(exit):");
            string = in.next();
        }
    }
}