import java.util.Scanner;
public class ExampleSwitch {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("월을 입력하세요: ");

        int month = stdin.nextInt();

        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울입니다.");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다.");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("여름입니다.");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("가을입니다.");
                break;
            default:
                System.out.println("해당 월은 존재하지 않습니다.");
                break;
        }
    }
}
