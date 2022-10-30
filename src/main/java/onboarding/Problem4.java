package onboarding;

public class Problem4 {

    static class Gram {
        String word;

        public Gram(String word) throws Exception {
            if (!isValidGram(word)) throw new Exception("Wrong String");
            this.word = word;
        }

        private boolean isValidGram(String word) {
            return isValidLength(word.length());
        }

        private boolean isValidLength(int n) {
            return n > 0 && n <= 1000;
        }

    }

    public static String solution(String word) {
        Gram gram;

        try {
            gram = new Gram(word);
        } catch (Exception e) {
            return "";
        }

        String temp = gram.word;
        String answer = "";
        for (int i = 0; i < temp.length(); i++) {
            char c = setCharacter(temp.charAt(i));
            answer += c;

        }


        return answer;
    }

    private static char setCharacter(char c) {
        if (isSmallLetter(c)) return (char) ('A' + Math.abs(c - 'Z'));
        else if (isLargeLetter(c)) return (char) ('a' + Math.abs(c - 'z'));

        return c;
    }

    static boolean isSmallLetter(char c) {
        return c >= 65 && c <= 90;
    }

    static boolean isLargeLetter(char c) {
        return c >= 97 && c <= 122;
    }

}
