import java.util.Scanner;

class StudentRepo{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Error Message
        String error = "\033[1;31mInvalid %s\n\033[0m";

        //names
        String name;

        //Age
        int age;

        //Subjects
        String sub1,sub2,sub3;

        //marks
        double mrks1,mrks2,mrks3;

        //Name validation
        System.out.print("Enter name of the Student: ");
        name = scanner.nextLine();
        name = name.toUpperCase();
        assert name.strip() != "" : "\033[1;31mInvalid Name\033[0m";

        //Age validation
        System.out.print("Enter student Age: ");
        age = scanner.nextInt();
        assert age > 10 && 18 > age :"\033[1;31mInvalid Age\033[0m";
    
        //subject validation
        System.out.print("Enter subject 1: ");
        scanner.nextLine();
        sub1 = scanner.nextLine();
        assert sub1.startsWith("SE-") == true && sub1.strip() != "" : "\033[1;31mInvalid Subject\033[0m";

        System.out.print("Enter marks: ");
        mrks1 = scanner.nextDouble();
        assert (0 < mrks1 && mrks1 < 100) : "Invalid marks";
        
        //sub2
        System.out.print("Enter subject 2: ");
        scanner.nextLine();
        sub2 = scanner.nextLine();
        assert sub1 != sub2 &&(sub1.startsWith("SE-") == true && sub1.strip() != "" ): "\033[1;31mInvalid Subject\033[0m"; 
        
        System.out.print("Enter marks: ");
        mrks2 = scanner.nextDouble();
        assert 0 < mrks2 && mrks2 < 100 : "Invalid marks";
        
        //sub3
        System.out.print("Enter subject 3: ");
        scanner.nextLine();
        sub3 = scanner.nextLine();
        assert ((sub1 != sub3)&& sub3 != sub2)&&(sub1.startsWith("SE-") == true && sub1.strip() != "") : "\033[1;31mInvalid Subject\033[0m"; 

        System.out.print("Enter marks: ");
        mrks3 = scanner.nextDouble();
        assert 0 < mrks3 && mrks3 < 100 : "Invalid marks";
        
        double total = mrks1 + mrks2 + mrks3;
        float avg;
        avg = (float)total/3;

        //Status
        String fStaus = avg >= 75 ? "\033[1;32mCredit Pass\033[0m" : avg >= 55 ? "\033[1;34mPass\033[0m": "\033[1;31mFail\033[0m";
        String sub1Staus = mrks1 >= 75 ? "\033[1;32mCredit Pass\033[0m" : mrks1 >= 55 ? "\033[1;34mPass\033[0m": "\033[1;31mFail\033[0m";
        String sub2Staus = mrks2 >= 75 ? "\033[1;32mCredit Pass\033[0m" : mrks2 >= 55 ? "\033[1;34mPass\033[0m": "\033[1;31mFail\033[0m";
        String sub3Staus = mrks3 >= 75 ? "\033[1;32mCredit Pass\033[0m" : mrks3 >= 55 ? "\033[1;34mPass\033[0m": "\033[1;31mFail\033[0m";
        System.out.println("\n\n\n");
        //output
        System.out.println("+-------------------------------------+");
        System.out.printf("|Name  : \033[1;34m%-29s\033[0m|\n",name.toUpperCase());
        System.out.printf("|Age   : %-2d years old               |\n",age);
        System.out.printf("|Status: %-40s|\n",fStaus);
        System.out.printf("|Total : %.0f\tAverage marks : %.2f |\n",total,avg);

        //grid
        System.out.printf("+" + "-".repeat(11) + "+" + "-".repeat(9) + "+" + "-".repeat(15) + "+\n");
        System.out.printf("|  %s  |  %s  |  %s       |\n","Subject","Marks","Status");
        System.out.printf("+" + "-".repeat(11) + "+" + "-".repeat(9) + "+" + "-".repeat(15) + "+\n");
        System.out.printf("|  %-6s   |  %5.2f  |  %-22s  |\n",sub1,mrks1,sub1Staus);
        System.out.printf("|  %-6s   |  %5.2f  |  %-22s  |\n",sub2,mrks2,sub2Staus);
        System.out.printf("|  %-6s   |  %5.2f  |  %-22s  |\n",sub3,mrks3,sub3Staus);
        System.out.printf("+" + "-".repeat(11) + "+" + "-".repeat(9) + "+" + "-".repeat(15) + "+\n");
    }
}