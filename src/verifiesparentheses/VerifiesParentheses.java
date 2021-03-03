package verifiesparentheses;

import java.util.Scanner;
/*
                Implement function verify(text) which verifies whether parentheses within text are
                correctly nested. You need to consider three kinds: (), [], <> and only these kinds.

    @author Nick
 */
public class VerifiesParentheses {

    public static void main(String[] args) {
        System.out.println("Insert the string to verify: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("You inserted: " + str);
        VerifyParenthesesClass verify = new VerifyParenthesesClass();
        if(verify.AreParenthesisClosed(str)){
            System.out.println("Everything is okay");
        }else{
            System.out.println("Smth is fucked up");
        }
    }   
}
