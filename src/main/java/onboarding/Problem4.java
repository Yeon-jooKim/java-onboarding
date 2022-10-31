package onboarding;

public class Problem4 {
    static class Gram {
        String word;
        public Gram(String word) throws Exception {
            if (!isValidGram(word.length())) throw new Exception("Wrong String");
            this.word = word;
        }
        private boolean isValidGram(int n) {
            return n > 0 && n <= 1000;
        }
    }

    private static char setCharacter(char c) {
        if (isLargeLetter(c)) return (char) ('A' + Math.abs(c - 'Z'));
        else if (isSmallLetter(c)) return (char) ('a' + Math.abs(c - 'z'));

        return c;
    }

    private static boolean isLargeLetter(char c) {
        return c >= 65 && c <= 90;
    }
    static boolean isSmallLetter(char c) {
        return c >= 97 && c <= 122;
    }


    public static String solution(String word) {
        String answer = "";
        return answer;
    }
}
