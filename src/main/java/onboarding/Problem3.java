package onboarding;

public class Problem3 {
    static class Number{
        int num;

        Number(int num) throws Exception {
            if(!isValidNumber(num))
            {
                throw new Exception("Wrong number");
            }
            this.num = num;
        }

        private static boolean isValidNumber(int num) {
            return num >= 1 && num <= 10000;
        }

    }

    public static int solution(int number) {
        int answer = 0;


        return answer;
    }



    private static int isClap(int n) {
        if(n == 3 || n == 6 || n == 9) return 1;

        return 0;
    }
}
