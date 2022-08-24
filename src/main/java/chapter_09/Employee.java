package chapter_09;

public class Employee extends Person{

    private String employeeId;
    private String title;

    public Employee() {
        super();
        System.out.println("This is from the Employee class");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
