
/**
 * Main 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = null;
        while (student == null) {
            System.out.println();
            System.out.println("어느 학생에게 질문할까요?");
            System.out.println("  1. Jenna  (R005)");
            System.out.println("  2. John   (R010)");
            System.out.println("  3. Maria  (R029)");
            System.out.println("  4. James  (R009)");
            System.out.print("번호 입력 (1~4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: student = new Student("Jenna", "R005");  break;
                case 2: student = new Student("John",  "R010"); break;
                case 3: student = new Student("Maria", "R029"); break;
                case 4: student = new Student("James", "R009");  break;
                default:
                    System.out.println("오류: 1~4 사이의 번호를 입력하세요.");
            }
        }

        int gu;
        while (true) {
            System.out.print(student.getName() + "(" + student.getStudent() + ")에게 몇 단을 답하라고 할까요? (1~9): ");
            gu = scanner.nextInt();

            if (gu >= 1 && gu <= 9) {
                break;
            }
            System.out.println("오류: 1~9 사이의 숫자를 입력하세요. 다시 입력해 주세요.");
        }

        System.out.println(student.getName() + "(" + student.getStudent() + ")에게, \"" + gu + "단을 답해주세요~\" 라고 질문하면,");
        student.askGugudan(gu);

        scanner.close();
    }
}