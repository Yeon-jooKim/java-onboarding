package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 65 && c <= 90) {
                c= (char) ('A' + Math.abs(c - 'Z'));
            } else if (c >= 97 && c <= 122) {
                c = (char) ('a' + Math.abs(c - 'z'));
            }
            answer+=c;

        }


        return answer;
    }
}
