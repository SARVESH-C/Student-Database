import java.util.*;

public class Main{
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        while(true){
            System.out.println("\n. Add 2.View 3. Search 4.Update 5. Delete 6. Exit");
        int choice = sc.nextInt();
    switch(choice){
        case 1: addStudent(); break;
        case 2: viewStudents(); break;
        case 6: System.exit(0);
    }}
    }
}