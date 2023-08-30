import java.util.Scanner;

public class ifsample {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하시오: ");
        int year = scanner.nextInt();

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = 1;

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if (isLeapYear) {
            System.out.println(year + "년은 윤년입니다.");
            daysInMonth[1] = 29;
        } else {
            System.out.println(year + "년은 평년입니다.");
        }

        System.out.print("월/일의 합을 입력하세요: ");
        int dayOfYear = scanner.nextInt();

        if (dayOfYear > 0 && dayOfYear <= 365) {
            if (dayOfYear > daysInMonth[0]) {
                month++;
                dayOfYear -= daysInMonth[0];
                if (dayOfYear > daysInMonth[1]) {
                    month++;
                    dayOfYear -= daysInMonth[1];
                    if (dayOfYear > daysInMonth[2]) {
                        month++;
                        dayOfYear -= daysInMonth[2];
                        if (dayOfYear > daysInMonth[3]) {
                            month++;
                            dayOfYear -= daysInMonth[3];
                            if (dayOfYear > daysInMonth[4]) {
                                month++;
                                dayOfYear -= daysInMonth[4];
                                if (dayOfYear > daysInMonth[5]) {
                                    month++;
                                    dayOfYear -= daysInMonth[5];
                                    if (dayOfYear > daysInMonth[6]) {
                                        month++;
                                        dayOfYear -= daysInMonth[6];
                                        if (dayOfYear > daysInMonth[7]) {
                                            month++;
                                            dayOfYear -= daysInMonth[7];
                                            if (dayOfYear > daysInMonth[8]) {
                                                month++;
                                                dayOfYear -= daysInMonth[8];
                                                if (dayOfYear > daysInMonth[9]) {
                                                    month++;
                                                    dayOfYear -= daysInMonth[9];
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(month + "월 " + dayOfYear + "일입니다.");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        }

        scanner.close();
    }
}

//1.처음   dayofyears<=31)가 31일 경우 2워 0으 출력한다.
//2. else break 해줘야 한다

