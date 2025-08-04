public class Employee {


    private String employeeName;
    private String employeeDesignation;
    private long employeeSalary;
    private String employeeDOB;
    private String employeeAddress;


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }
    
    public long getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeDOB() {
        return employeeDOB;
    }

    public void setEmployeeDOB(String employeeDOB) {
        this.employeeDOB = employeeDOB;
    }


    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + getEmployeeName());
        System.out.println("Designation: " + getEmployeeDesignation());
        System.out.println("Salary: " + getEmployeeSalary());
        System.out.println("Date of Birth: " + getEmployeeDOB());
        System.out.println("Address: " + getEmployeeAddress());
    }
}