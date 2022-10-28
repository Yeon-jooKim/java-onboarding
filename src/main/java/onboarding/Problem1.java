package onboarding;

import java.util.List;

class Problem1 {
    static class BookPage {
        private int startPage;
        private int endPage;

        BookPage(int startPage, int endPage) throws Exception {
            if (!isValid(startPage, endPage)) throw new Exception("Wrong Page!");
            this.startPage = startPage;
            this.endPage = endPage;
        }
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int pobi_score = 0;
        int crong_score = 0;
        BookPage pobiBookPage;
        BookPage crongBookPage;

        try {
            pobiBookPage = new BookPage(pobi.get(0), pobi.get(1));
            crongBookPage = new BookPage(crong.get(0), crong.get(1));
        } catch (Exception e) {
            return -1;
        }

        pobi_score = Math.max(pobi_score, calculation(pobiBookPage.startPage));
        pobi_score = Math.max(pobi_score, calculation(pobiBookPage.endPage));
        crong_score = Math.max(crong_score, calculation(crongBookPage.startPage));
        crong_score = Math.max(crong_score, calculation(crongBookPage.endPage));

        if (pobi_score > crong_score) return 1; //포비가 이겼다면
        if (pobi_score < crong_score) return 2; //크롱이 이겼다면
        if (pobi_score == crong_score) return 0; // 무승부라면
        return -1; // 예외 처리
    }

    private static boolean isValidPage(int startPage, int endPage) {
        return startPage >= 1 && endPage <= 400;
    }

    private static boolean isConsecutivePages(int startPage, int endPage) {
        return startPage + 1 == endPage;
    }

    private static boolean isCorrectOddAndEven(int startPage, int endPage) {
        return startPage % 2 == 1 && endPage % 2 == 0;
    }


    private static boolean isValid(int startPage, int endPage) {
        //책의 시작면이나 마지막 면을 펼쳤다면
        if (!isValidPage(startPage, endPage)) return false;

        //페이지 숫자가 연속되지 않았다면
        if (!isConsecutivePages(startPage, endPage)) return false;

        //짝수 홀수가 제 자리에 있지 않았다면
        if (!isCorrectOddAndEven(startPage, endPage)) return false;

        return true;
    }

    private static int calculation(int page) {
        int score_multiply = 1; //전부 곱할 경우 값
        int score_plus = 0;     //전부 더할 경우 값
        while (page > 0) {
            score_multiply *= page % 10;
            score_plus += page % 10;
            page /= 10;
        }

        return Math.max(score_multiply, score_plus);
    }

}