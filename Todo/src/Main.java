import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Command Line Todo application");
            System.out.println("=============================");
            System.out.println("");
            System.out.println("Command line arguments:");
            System.out.println(" -l   Lists all the tasks");
            System.out.println(" -a   Adds a new task");
            System.out.println(" -r   Removes an task");
            System.out.println(" -c   Completes an task");
        }
        
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();

        if (command == "-l"){

        }


      /*  try {
            Path path = Paths.get("text.txt");
        }catch (){

        }*/

    }
}
