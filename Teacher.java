// This class keeps track of teacher's name, id, and salary.


public class Teacher {
    private String name;
    private int id;
    private double salary;
    private double salaryEarned;

    // Constructor to initialize the teacher's details
    public Teacher(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    // Getter methods to retrieve the teacher's details
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void receiveSalary(double salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}
