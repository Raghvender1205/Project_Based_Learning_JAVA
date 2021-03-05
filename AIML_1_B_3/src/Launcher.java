import java.util.Scanner;

public class Launcher {
    Scanner sc = new Scanner(System.in);
    int options;
    
    FDAccount fd;
    RDAccount rd;
    SBAccount sb;
    public static void main(String[] args){
        Launcher l = new Launcher();
        l.mainMenu();
    }

    void mainMenu(){
        System.out.println("");
        System.out.println("................MAIN MENU..............");
        System.out.println("Select Account Type");
        System.out.println("1. FD Account");
        System.out.println("2. RD Account");
        System.out.println("3. SB Account");
        System.out.println("........................................");
        
        System.out.println("Enter option: ");
        options = sc.nextInt();

        switch(options){
            case 1:
                if (fd == null){
                    fd = new FDAccount();
                } else{
                    fd.calculateIntrest();
                }
                mainMenu();
                break;
            case 2:
                if (rd == null) {
                    rd = new RDAccount();
                } else {
                    rd.calculateIntrest();
                }
                mainMenu();
                break;
            case 3:
                if (sb == null) {
                    sb = new SBAccount();
                } else {
                    sb.calculateIntrest(Scanner sc);
                }
                mainMenu();
                break;
        }   
    }
}
