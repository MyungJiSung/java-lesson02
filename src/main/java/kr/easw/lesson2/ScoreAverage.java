package kr.easw.lesson2;

import java.util.Scanner;

public class ScoreAverage {

    public static void main(String[] args) {
        double score = getAverageScore(new Scanner(System.in));     // 점수 입력 받는 함수 실행
        System.out.printf("당신의 점수는 %.2f점 입니다.%n", score);       // score값 호출하여 출력
        System.out.printf("당신은 %s 등급 입니다.", estimateGrade(score));
    }
    /**
     * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :
     * 사용자가 0을 입력하기 전까지 계속해서 score에 숫자를 더해야 합니다.
     * 사용자가 0을 입력할 경우, while문을 break해야 합니다.
     */
    private static double getAverageScore(Scanner scanner) {
        int loop = 0;
        int scores = 0;
        int score;

        while (true) {
            score=scanner.nextInt();

            if(score == 0)
                break;

            scores = scores + score;
            loop++;
        }
        return ((double)scores) / ((double)loop);
    }

    /**
     * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :
     * 다중 if문을 활용하여 범위에 맞는 점수일 떄, 문자열을 반환해야 합니다.

     * - 90점 이상은 "A"를 반환해야 합니다.
     * - 80점 이상은 "B"를 반환해야 합니다.
     * - 70점 이상은 "C"를 반환해야 합니다.
     * - 나머지는 "D"를 반환해야 합니다.
     *
     * @param averageScore 평균 점수
     */
    private static String estimateGrade(double averageScore) {
        double yourScore;
        yourScore = averageScore;

        if( yourScore >= 90){
            return "A";
        }
        else if( yourScore >= 80){
            return "B";
        }
        else if( yourScore >= 70){
            return "C";
        }

        else
            return "D";
    }

}