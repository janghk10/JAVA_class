import java.util.Scanner;

public class FinalNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * 100) + 1;
        int answer = 0;

        while (true) {
            System.out.print("숫자 입력(1~100): ");
            int guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("1~100만 입력하셔야 합니다.");
                continue;
            }
            answer++;

            if (guess < number) {
                System.out.println("up: 더 큰 수입니다.");
            } else if (guess > number) {
                System.out.println("down: 더 작은 수입니다.");
            } else {
                System.out.println("정답입니다.");
                System.out.println("시도 횟수: " + answer + "회");
                break;
            }
        }

        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
}