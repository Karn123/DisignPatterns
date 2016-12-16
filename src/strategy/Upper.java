package strategy;

/**
 * Created by Karn on 2016/12/6.
 */
public class Upper implements ValidationType {
    @Override
    public void validateType(String s) {
        if(isUpperCase(s)) {
            System.out.println("*** Good ***");
        }
        else {
            System.out.println("*** Bad ***");
        }
    }
    public boolean isUpperCase(String s){
        char[] chs = s.toCharArray();
        boolean flag = true;
        for(char ch:chs){
            if(!Character.isUpperCase(ch)){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
