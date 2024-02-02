import java.util.Scanner;

class Student {
    String Name;
    int roll_no;
    long Phone_Num;
    String Address;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("Enter the name:");
        s.Name = sc.nextLine();

        System.out.println("Enter the Roll No:");
        s.roll_no = sc.nextInt();

        System.out.println("Enter the Phone No:");
        s.Phone_Num = sc.nextLong();

        sc.nextLine(); // Consume newline character
        System.out.println("Enter the Address:");
        s.Address = sc.nextLine();

        Student s1 = new Student();

        System.out.println("Enter the name:");
        s1.Name = sc.nextLine();

        System.out.println("Enter the Roll No:");
        s1.roll_no = sc.nextInt();

        System.out.println("Enter the Phone No:");
        s1.Phone_Num = sc.nextLong();

        sc.nextLine(); // Consume newline character
        System.out.println("Enter the Address:");
        s1.Address = sc.nextLine();

        System.out.println("Student_1 Details");
        System.out.println("*****************");
        System.out.println("Student name: " + s.Name + "\n" +
                "Student Rollno: " + s.roll_no + "\n" +
                "Phone Number: " + s.Phone_Num + "\n" +
                "Address: " + s.Address);
        System.out.println("Student_2 Details");
        System.out.println("*****************");
        System.out.println("Student name: " + s1.Name + "\n" +
                "Student Rollno: " + s1.roll_no + "\n" +
                "Phone Number: " + s1.Phone_Num + "\n" +
                "Address: " + s1.Address);
    }
}
