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
        Number numberClass;
        try {
            numberClass = new Number(number);
        }catch (Exception e) {
            return 0;
        }

        int answer = 0;
        for (int i = 1; i <=numberClass.num ; i++) {
            int temp = i;
            while (temp>0)
            {
                int n = temp % 10;
                if(n==3||n==6||n==9)
                {
                    answer++;
                }
                temp/=10;
            }
        }



        return answer;
    }
}
