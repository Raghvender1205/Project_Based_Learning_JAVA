import java.util.Scanner;

public class EmpManager {
    String[] empName, joinDate, departmentn, designation;
    int[] basic, hra, da, it, empId;
    char[] desCode_1, desCode_2;

    public static void main(String[] args) {
        EmpManager mEmpManager = new EmpManager();
        mEmpManager.empName = new String[] {"Shourya", "Deepinder", "Siddhant"};
        mEmpManager.joinDate = new String[] {"10 Mar 2020", "10 Apr 2020", "10 May 2020"};
        mEmpManager.departmentn = new String[] { "BA", "Commerce", "CSE"};
        mEmpManager.basic = new int[] {70000, 70000, 80000};
        mEmpManager.hra = new int[] {7000, 7000, 8000};
        mEmpManager.it = new int[] { 700, 700, 800};
        mEmpManager.empId = new int[] { 1001, 1003, 1005 };
        mEmpManager.desCode_1 = new char[] {'b', 'e', 'c'};
    
        mEmpManager.da = new int[] { 70000, 70000, 80000 };
        mEmpManager.desCode_2 = new char[] {'c', 'b', 'e'};
        mEmpManager.designation = new String[] { "Army", "CA", "Software Developer" };

        mEmpManager.display(mEmpManager);
    }

    void display(EmpManager mEmpManager){
        System.out.println("Enter Employee ID: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int i = 0;
        boolean isEx = false;
        for (i = 0; i < mEmpManager.empId.length; i++) {
            if (id == mEmpManager.empId[i]) {
                isEx = true;
                break;
            }
        }
        if (isEx) {
            System.out.println("You are an existing employee");
            int j = 0;
            for (j = 0; j < mEmpManager.desCode_2.length; j++) {
                if (mEmpManager.desCode_1[i] == mEmpManager.desCode_2[j]) {
                    break;
                }
            }
            int salary = mEmpManager.basic[i] + mEmpManager.hra[i] + mEmpManager.da[j] - mEmpManager.it[i];

            System.out.println("");
            System.out.println("Employee details are as: ");
            System.out.println("Employee name: " + mEmpManager.empName[i]);
            System.out.println("Salary: " + salary);
            System.out.println("Designation: "+mEmpManager.designation[j]);
            System.out.println("The DA of Employee: "+mEmpManager.da[j]);
        } else {
            System.out.println("Employee does not exist");
        }
        mEmpManager.display(mEmpManager);
    }
}
