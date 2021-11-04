import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        HashSet<String> hashSet = new HashSet<>();
        while (true) {
            System.out.println("Введите информацию о студенте: ФИО, номер группы, номер студенческого");
            student.name = scanner.next();
            hashSet.add(student.name);
            System.out.println("Введите номер группы");
            student.group = scanner.next();
            hashSet.add(student.group);
            System.out.println("Введите id студента");
            student.studentId = scanner.next();
            hashSet.add(student.studentId);
            System.out.println("Чтобы выйти из программы пишите end");
            String end = scanner.next();
            if (end.equalsIgnoreCase("end")) {
                System.out.println("Список студентов");
                System.out.println(hashSet);
                break;
            }
        }
    }
}
