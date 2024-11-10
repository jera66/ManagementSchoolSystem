// This class keeps track of student fees, name, id, and grade.

public class Student {
    private int id;
    private String name;
    private int grade;
    private double paidFees;
    private double totalFees;

    // Constructor
    public Student(int id, String name, int grade, double totalFees) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.totalFees = 30000;
        this.paidFees = 0;
    }
     public void setGrade(int grade){
        
     }
    public void updatePaidFees(double fees){
        this.paidFees += fees;
    }
    public int getGrade() {
        return grade;
    }
    public double getPaidFees() {
        return paidFees;
    }
    public void payFees(double fees) {
        
    }
    public int getRemainingFees() {
        return getRemainingFees();
    }
}