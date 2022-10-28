package onboarding;

import java.util.Stack;

public class Problem2 {

    static class Password {
        String cryptogram;

        public Password(String cryptogram) throws Exception {
            if (!isValidGram(cryptogram)) throw new Exception("Wrong String");
            this.cryptogram = cryptogram;
        }

        private boolean isValidGram(String cryptogram) {
            if(!isValidLength(cryptogram.length())) return false;
            for (int i = 0; i <cryptogram.length() ; i++) {
                if(!isSmallLetter(cryptogram.charAt(i))) return false;
            }
            return true;

        }

        private boolean isValidLength(int n) {
            return n>0 &&n<=1000;
        }
        private boolean isSmallLetter(char c){
            return c >= 97 && c <= 122;
        }

    }


    public static String solution(String cryptogram) {
        Password password;
        try {
            password = new Password(cryptogram);
        } catch (Exception e) {
            return "";
        }
        String temp = password.cryptogram;

        Stack<Character> stack = new Stack();
        stack.push(temp.charAt(0));
        for (int i = 1; i < temp.length(); i++) {
            if (stack.peek() == temp.charAt(i)) {
                stack.pop();
            } else {
                stack.push(temp.charAt(i));
            }
        }
        String answer = "";
        for (Character character : stack) {
            answer += character;
        }
        return answer;
    }
}
