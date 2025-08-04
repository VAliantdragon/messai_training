public class EmployeeOnboardingSystem {
    public static void main(String[] args) {
        pattern();
        primeNumbers();
        details();
        System.out.println();
        Compensation_Calculator();

    }

    public static void details(){

        final String COMPANY_NAME = "HDFC Life";


        String employeeName = "Amit Kumar";
        int employeeAge = 30;
        String employeeCity = "Mumbai";
        float joiningPercentage = 85.5f;
        char performanceGrade;

        System.out.println("Welcome to " + COMPANY_NAME + "!");
        System.out.println("\n--- Employee Profile ---");
        System.out.println("Name: " + employeeName);
        System.out.println("Age: " + employeeAge + " years");
        System.out.println("City: " + employeeCity);
        System.out.println("Joining Percentage: " + joiningPercentage + "%");

        if (joiningPercentage > 90) {
            performanceGrade = 'A';
        } else if (joiningPercentage >= 75 && joiningPercentage <= 90) {
            performanceGrade = 'B';
        } else if (joiningPercentage >= 60 && joiningPercentage <= 74) {
            performanceGrade = 'C';
        } else {
            performanceGrade = 'D';
        }

        switch (performanceGrade) {
            case 'A':
                System.out.println("Star Performer");
                break;
            case 'B':
                System.out.println("Strong Start");
                break;
            case 'C':
                System.out.println("Satisfactory");
                break;
            case 'D':
                System.out.println("Needs Mentorship");
                break;
            default:
                System.out.println("Invalid Grade");
                break;
        }
    }

    public static void pattern(){
        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
            System.out.print("*");

        }
            System.out.println();
        }
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++ ){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeNumbers(){
        int n=50;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }

    public static void Compensation_Calculator(){
        float monthlyCTC = 58000.50f;
        int monthlyCTCAsInt=(int)(monthlyCTC);

        System.out.println("Original Monthly CTC (float): " + monthlyCTC);

        System.out.println("Monthly CTC after typecasting to int: " + monthlyCTCAsInt);

        float annualCTC = monthlyCTC * 12;
        System.out.println("Initial Annual CTC: " + annualCTC);

        float bonus = 10000.00f;
        annualCTC += bonus;
        System.out.println("Annual CTC after adding bonus (" + bonus + "): " + annualCTC);

    }

}
