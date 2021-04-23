public class App {
    public static void main(String[] args) throws Exception {
        Thread tortoise = new Tortoise(); // object for the Tortoise Thread
        tortoise.start();
        for (int a=0; a<=11; a++) {
            System.out.println("Distance covered by HARE: "+(a));
        }
        System.out.println("HARE is going to sleep"); // Sleep 
        try {
            Thread.sleep(3000); // Current Thread
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("HARE again started the race"); // Wakes up
        for (int b=11; b<21; b++) {
            System.out.println("Distance covered by HARE: "+(b));
        }
        System.out.println("HARE completed the race");
    }
}

class Tortoise extends Thread {
    public void run() {
        for (int c = 0; c <= 21; c++) {
            System.out.println("Distance Covered by the Tortoise: "+c);
        }
        System.out.println("TORTOISE WIN"); // Tortoise Wins
    }
}
