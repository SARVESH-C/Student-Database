import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   static ArrayList<Student> students = new ArrayList<>();
   
   static Scanner sc;

   public Main() {
   }

   public static void main(String[] var0) {
      while(true) {
         System.out.println("\n 1.Add 2.View 3. Search 4.Update 5. Delete 6. Exit");
         int var1 = sc.nextInt();
         switch (var1) {
            case 1:
               addStudent();
               break;
            case 2:
               viewStudent();
               break;
            case 3:
               searchStudent();
               break;
            case 4:
               updateStudent();
               break;
            case 5:
               deleteStudent();
               break;
            case 6:
               System.exit(0);
         }
      }
   }

   static void addStudent() {
      System.out.println("Enter roll Number: ");
      int rollNo = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter Name : ");
      String name = sc.nextLine();
      System.out.println("Enter marks: ");
      double marks = sc.nextDouble();
      students.add(new Student(rollNo, name, marks));
      System.out.println("Student added successfully");
   }

   static void viewStudent() {
    for(Student s : students){
        System.out.println("Roll No: "+s.rollNo + "Name :" + s.name + "Marks: "+s.marks);
    }
   }

   static void searchStudent() {
    System.out.println("Enter the Roll No: ");
    int search = sc.nextInt();
    boolean found = false;
    for(Student s : students) {
        if(s.rollNo == search) {
            System.out.println("Roll No: " + s.rollNo + " Name: " + s.name + " Marks: " + s.marks);
            found = true;
            break;
        }
    }
    if(!found) {
        System.out.println("Student doesn't exist!");
    }
}

   static void updateStudent() {
    System.out.println("Enter the Roll No: ");
    int search = sc.nextInt();
    for(Student s : students){
        if(s.rollNo == search){
            System.out.println("Enter New Marks: ");
            double newMarks = sc.nextDouble();
            s.marks = newMarks;
            System.out.println("Marks updated successfully");
        }
    }
   }

   static void deleteStudent() {
    System.out.println("Enter the Roll No: ");
    int delete = sc.nextInt();
    Student toDelete = null;
    for(Student s: students){
        if(s.rollNo == delete){
            toDelete = s;
            break;
        }
    }
    if(toDelete != null){
        students.remove(toDelete);
        System.out.println("Student deleted successfully");
    }else{
        System.out.println("Student not found");
    }
    }
   

   static {
      sc = new Scanner(System.in);
   }
}
