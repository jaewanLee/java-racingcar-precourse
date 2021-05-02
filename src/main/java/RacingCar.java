import java.util.Scanner;

public class RacingCar {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = scanner.nextLine();
        try {
            RacingCars racingCars = new RacingCars(InputHandler.parsingName(input));
            run(racingCars);
        } catch (Exception e) {
            System.out.println("오류 : " + e.getMessage());
        }
    }

    private static void run(RacingCars racingCars) {
        System.out.println("시도할 회수는 몇회인가요?");
        Integer count = scanner.nextInt();
        System.out.println("실행 결과");
        System.out.println(racingCars.racing(count));
    }
}
