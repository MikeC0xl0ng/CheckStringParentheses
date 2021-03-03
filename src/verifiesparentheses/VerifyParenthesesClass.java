package verifiesparentheses;

/**
 *
 * @author Nick
 */

public class VerifyParenthesesClass {

    private int numberOfClosedParenthesis = 0;
    
    public boolean AreParenthesisClosed(String strToAnalize){
        int lengthOfString = strToAnalize.length();
        int i;
        for(i=0;i<lengthOfString;i++){
            char ch = strToAnalize.charAt(i);
            if(ch == ')' || ch == ']' || ch == '}'){
                numberOfClosedParenthesis--;
                if(numberOfClosedParenthesis < 0)
                    return false;
            }
            boolean isThereAnyParantheses = ch == '(' || ch == '[' || ch == '{';
            if(isThereAnyParantheses){
                if(!searchForClosure(ch, strToAnalize.substring(i)))
                    return false;
            }
        }
        return true;
    }
    
    private boolean searchForClosure(char parentheses, String substring){
        char closureParentheses = ' ';
        switch(parentheses){
            case('('):
                closureParentheses = ')';
                break;
            case('['):
                closureParentheses = ']';
                break;
            case('{'):
                closureParentheses = '}';
        }
        for(char ch : substring.toCharArray()){
            if(ch == closureParentheses){
                numberOfClosedParenthesis++;
                return true;
            }
        }
        return false;
    }
}
