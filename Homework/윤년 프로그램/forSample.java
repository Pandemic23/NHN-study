import java.util.Scanner;

public class forSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하시오: ");
        int year = scanner.nextInt();

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = 1;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "년은 윤년입니다.");
            daysInMonth[1] = 29;
        } else {
            System.out.println(year + "년은 평년입니다.");
        }

        System.out.print("월/일의 합을 입력하세요: ");
        int dayOfYear = scanner.nextInt();

        for (int i = 0; i < daysInMonth.length; i++) {
            if (dayOfYear <= daysInMonth[i]) {
                month = i + 1;
                break;
            }
            dayOfYear -= daysInMonth[i];
        }

        System.out.println(month + "월 " + dayOfYear + "일입니다.");
        scanner.close();
    }
}
