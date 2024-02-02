class Student
{
    String Name;
    int roll_no;
    long Phone_Num;
    String Address;
    public static void main (String[] args) 
    {
    Student s = new Student();
    s.Name = "john";
    s.roll_no = 2;
    s.Phone_Num = 9840043713L;
    s.Address = "No:24/26 XXXX, CH-600119";
    Student s1 = new Student();
    s1.Name = "Sam";
    s1.roll_no = 3;
    s1.Phone_Num = 9840043717L;
    s1.Address = "No:24/26 XXXX, CH-600116";
    
    System.out.println("Student name:" + s.Name + "\n" +"Student Rollno:"+ s.roll_no + "\n" +"Phone Number:" + s.Phone_Num + "\n" +"Address:" + s.Address);
    System.out.println("Student name:" + s1.Name + "\n" +"Student Rollno:"+ s1.roll_no + "\n" +"Phone Number:" + s1.Phone_Num + "\n" +"Address:" + s1.Address);
        
    }
    
}
