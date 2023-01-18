import java.util.Scanner;

class Student{
    public String Name;
    public int RollNo;

    public void setInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        Name = sc.next();
        System.out.print("Enter roll no: ");
        RollNo = sc.nextInt();
    }

    public void getInfo(){
        System.out.println("Name: "+ Name);
        System.out.println("Roll no: "+ RollNo);
    }
}

public class ArrayOfObject {
    public static void main(String[] args) {
        System.out.println("Welcome to Array of object in JAVA");

        // Student st = new Student();
        // st.setInfo();
        // st.getInfo();
    
        Student StudentsArray[] = new Student[5];

        System.out.println("Enter students information........");
        for(int i=0; i<5; i++) {
            StudentsArray[i] = new Student();
            StudentsArray[i].setInfo();
        }

        System.out.println("Printing students information........");
        for(int i=0; i<5; i++) {
            StudentsArray[i].getInfo();
        }
    }
}


/*
 OUTPUT:
 Welcome to Array of object in JAVA
Enter students information........
Enter name: Sanket
Enter roll no: 18
Enter name: Kartik 
Enter roll no: 55
Enter name: Piyush 
Enter roll no: 56
Enter name: Shekhar
Enter roll no: 6
Enter name: Pranav
Enter roll no: 77
Printing students information........
Name: Sanket
Roll no: 18
Name: Kartik
Roll no: 55
Name: Piyush
Roll no: 56
Name: Shekhar
Roll no: 6
Name: Pranav
Roll no: 77
 */