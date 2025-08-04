//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) {
        Employee obj=new Employee();
        obj.setEmployeeName("Vampire krishna reddy");
        obj.setEmployeeDesignation("Software Engineer");
        obj.setEmployeeSalary(60000);
        obj.setEmployeeAddress("123 Main Street");
        obj.setEmployeeDOB("27/06/2002");

//        obj.displayEmployeeDetails();
        switchCase();

    }

    public static void switchCase() {

        int i = 10;

        switch (i) {
            case 5:
                System.out.println("five");
                break;
            case 10:
                System.out.println("ten");
                break;
            case 15:
                System.out.println("fifteen");
                break;
            case 20:
                System.out.println("twenty");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}

