import java.io.*;
import java.util.*;

public class EmployeeManager {
    int choice = 0;
    Scanner sc = new Scanner(System.in);
    ArrayList<Employee> EmployeeList= new ArrayList<Employee>();
    public static void main(String[] args) {
        EmployeeManager objectManager = new EmployeeManager();
        objectManager.displayMenu();
        while (objectManager.choice != 5){
            objectManager.displayMenu();
        }
    }

    void displayMenu(){
        System.out.println("Main Menu");
        System.out.println("Enter Your Choice");
        System.out.println("1. Add an Employee");
        System.out.println("2. Display All");
        System.out.println("3. Write all Employees into a File");
        System.out.println("4. Read all Employees from a File");
        System.out.println("5. Exit");

        choice = sc.nextInt();
        try {
            switch(choice){
                case 1:
                    getEmployeeInfo();
                    break;
                case 2:
                    displayFromList(EmployeeList);
                    break;
                case 3:
                    System.out.println("Write the File name you want to write to: ");
                    writeEmployeeToFile(sc.next());
                    break;
                case 4:
                    System.out.println("Write the File name you want to read from: ");
                    readEmployeeFromFile(sc.next());
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
            }
        } catch (InputMismatchException e){
            e.printStackTrace();
        }
    }
    


    void getEmployeeInfo(){
        try {
            System.out.println("Enter Employee ID: ");
            int id = sc.nextInt();
            System.out.println("Enter Employee Name: ");
            String name = sc.next();
            System.out.println("Enter Employee Age: ");
            int age = sc.nextInt();
            System.out.println("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            EmployeeList.add(new Employee(id, name, salary, age));
        } catch (InputMismatchException e){
            e.printStackTrace();
        }
    }

    String displayFromList(ArrayList<Employee> objectList){
        String status = "";
        try {
            Iterator it = objectList.iterator();
            while(it.hasNext()){
                System.out.println("" + it.next());
            }
            status = "Display Successfully";
            return status;
        } catch (Exception e){
            status = "Failure";
            return status; // return String
        }
    }

    /** Reading and Writing to a File*/
    void writeEmployeeToFile(String fileName){
        File mFile = new File(fileName);
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(mFile);
            System.out.println("inside File");

            ObjectOutputStream objectWriter = new ObjectOutputStream(fout);
            System.out.println();
            objectWriter.writeObject(EmployeeList);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    } 

    String readEmployeeFromFile(String fileName){
        String status = "";
        File fo = new File(fileName);
        if (!fo.exists()){
            status = "Unable to create a File";
            return status;
        }

        FileInputStream fin;
        try {
            fin = new FileInputStream(fo);
            ObjectInputStream objectReader = new ObjectInputStream(fin);
            EmployeeList.clear();
            EmployeeList = (ArrayList<Employee>) objectReader.readObject();

            status = displayFromList(EmployeeList);
            if (status.equalsIgnoreCase("Display Successfully")){
                status = "Files read Successfully";
                return status;
            }
            else {
                status = "";
                return status;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } finally {}
        return status;
    }
}
