import java.util.Scanner;

class Employee {
    int year of joining;
    String name,address;
     

}

class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many employee:");
        int k = sc.nextInt();

        Employee emp[] = new Employee[k];

        for (int i = 0; i < k; i++) {
            emp[i] = new Employee();

            System.out.println("Enter " + (i + 1) + " Employee data :");

            System.out.print("Enter employee year of joining :");
            emp[i].year of joining = sc.nextInt();
            System.out.print("Enter employee name :");
            emp[i].name = sc.next();
            System.out.print("Enter employee address :");
            emp[i].address = sc.next();

        }

        System.out.println("\n\n============ All employee details are :============\n");

        for (int i = 0; i < k; i++) {
            System.out.println("Employee year of joining,  name, and salary :" + emp[0].id + " " + emp[i].name + " " + emp[i].sal);

        }
    }

}