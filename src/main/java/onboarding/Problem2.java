package onboarding;

import java.util.Stack;

public class Problem2 {



    public static String solution(String cryptogram) {

        Stack<Character> stack = new Stack();
        stack.push(cryptogram.charAt(0));
        for (int i = 1; i <cryptogram.length() ; i++) {
            if(stack.peek()==cryptogram.charAt(i))
            {
                stack.pop();
            }else{
                stack.push(cryptogram.charAt(i));
            }
        }
        String answer="";
        for (Character character : stack) {
            answer += character;
        }
        return answer;
    }
}
