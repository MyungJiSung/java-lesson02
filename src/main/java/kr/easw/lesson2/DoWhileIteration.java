package kr.easw.lesson2;

import java.util.Random;
import java.util.Scanner;

/*
 * 해당 클래스는 간단한 블랙잭 게임의 예제입니다.
 * do-while로 적절한 코드를 작성하였다면, 간단한 블랙잭 게임이 진행됩니다.
 */
public class DoWhileIteration {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static final int TARGET_VALUE = 21;
    private static int currentValue = 0;


    public static void main(String[] args) {        // 메인
        System.out.println("시작합니다.");
        checkValue();                           // 실행시 현재점수가 변수에 저장됨
        if (currentValue >= TARGET_VALUE) {     // 21점 초과 시
            System.out.println("최종 점수: 0");
            System.out.println("패배했습니다.");
        } else {                                // 21점 미만 시
            System.out.println("최종 점수: " + (TARGET_VALUE - (TARGET_VALUE - currentValue)));
        }
    }

    /**
     * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :
     * - increaseValue 메서드를 do-While 안에서 사용해야 합니다.
     * - do-While문의 조건으로 stopGame 메서드를 사용해야 합니다.
     * <p>
     * 다음과 같은 제한을 가집니다 :
     * - do-while문을 반드시 이용해야 합니다.
     */
    private static void checkValue() {

        do{
            increaseValue();
            System.out.println("현재 패의 총합은 : "+currentValue);
        }
        while(!stopGame());

    }

    public static boolean stopGame() {      // Y이면 계속 N이면 멈춤
        if (TARGET_VALUE <= currentValue)
            return true;
        String nextValue = null;        // 문자열 초기화
        while (true) {
            System.out.print("계속 합니까? (Y / N) : ");
            String input = scanner.next();
            if (input.equals("Y") || input.equals("N")) {
                nextValue = input;
                break;
            }
            System.out.println();
        }
        return nextValue.equals("N");
    }

    private static void increaseValue(){
        currentValue += random.nextInt(10) + 1;
    }

}