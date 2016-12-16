package strategy;

/**
 * Created by Karn on 2016/12/6.
 */
public class Digit implements ValidationType {
    @Override
    public void validateType(String s) {
        if(isDigit(s)) {
            System.out.println("*** Good ***");
        }
        else{
            System.out.println("*** Bad ***");
        }
    }
    public boolean isDigit(String s){
        try{
              Integer.parseInt(s);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
}