import java.util.*;

public class Main{
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        while(true){
            System.out.println("\n 1.Add 2.View 3. Search 4.Update 5. Delete 6. Exit");
        int choice = sc.nextInt();
    switch(choice){
        case 1: addStudent(); break;
        case 2: viewStudent(); break;
        case 3: searchStudent(); break;
        case 4: updateStudent(); break;
        case 5: deleteStudent(); break;
        case 6: System.exit(0);
    }}
    }
    static void addStudent(){
        System.out.println("Enter roll Number: ");
        int rollNo = sc.nextInt();
        System.out.println("Enter Name : ");
        String name = sc.next();
        System.out.println("Enter marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(rollNo, name, marks));
        System.out.println("Student added successfully");
    }

    static void viewStudent(){

    }
    static void searchStudent(){

    }
    static void updateStudent(){

    }
    static void deleteStudent(){
    }
}