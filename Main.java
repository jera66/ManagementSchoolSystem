import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John Doe", 30, 500);
        Teacher teacher2 = new Teacher("Jane Smith", 31, 600);
        Teacher teacher3 = new Teacher("Bob Johnson", 32, 700);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher);
        teachers.add(teacher2);
        teachers.add(teacher3);

        Student student1 = new Student(1, "Alice", 9, 30000);
        Student student2 = new Student(2, "Bob", 10, 30000);
        Student student3 = new Student(3, "Charlie", 11, 30000);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        School school = new School(teachers, students);
        System.out.println("The school has earned $"+ school.getTotalMoneyEarned()+ ".");

        student1.payFees(10000);
        student2.payFees(3000);

        System.out.println("-------------Teacher Salary Payouts--------------");
        teacher2.receiveSalary(teacher2.getSalary() * 0.1);
        System.out.println("The salary of Jane Smith after paying 10% is: $"+ teacher2.getSalary());
        }
        
}
