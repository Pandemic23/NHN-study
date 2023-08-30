import java.util.Scanner;

public class Demonstrate {
    public static void main(String [] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("년도를 입력하시오 : ");
        int n=scanner.nextInt();
        
        int [] day= {31,28,31,30,31,30,31,31,30,31,30,31};
        int month =1;
        if  ((n%4==0)&&(n%100 !=0 )||(n%400==0))
        {
            System.out.println("윤년입니다.");
            day[1]=29;
        }
        else {
            System.out.println("평년입니다.");
        }
        System.out.print("월/일의 합을 입력하세요:");
        int n2= scanner.nextInt();
        
        for (int i=0; i< day.length; i++){
            int j=0;
            int k= day[i]+month+i;
            j+=day[i];
            if (k==n2){
                
            System.out.println(month+i+"월"+day[i]+"일입니다.");
            }
            else if(0<n2&&n2<j){
                
            System.out.println(month+i+"월"+day[i]+"일입니다.");
                break;
            }
            else{
                System.out.println("잘못 입력하셨습니다.");
            }
    }
        scanner.close();

    }
}


//1~365일 숫자 입력시
//몇월 몇일인지 출력
//윤년 계산법
//윤년은 2월 29일까지
