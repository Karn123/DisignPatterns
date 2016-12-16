package strategy;

/**
 * Created by Karn on 2016/12/6.
 */
public class Lower implements ValidationType {
    @Override
    public void validateType(String s) {
        if(isLowerCase(s)) {
            System.out.println("*** Good ***");
        }
        else {
            System.out.println("*** Bad ***");
        }
    }
    public boolean isLowerCase(String s){
        char[] chs = s.toCharArray();
        boolean flag = true;
        for(char ch:chs){
            if(!Character.isLowerCase(ch)){
                flag = false;
                break;
            }
        }
        return flag;
    }
}