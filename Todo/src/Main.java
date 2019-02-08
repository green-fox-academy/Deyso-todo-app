import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
        ListTask myTodoList = new ListTask();
        int i = 0;
        while (i==0) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.next();


            if (command.equals("-l")) {
                List<String > etwas = myTodoList.getList();
                for (String valami:etwas) {
                    System.out.println(valami);
                }
            }
        }
    }
}
