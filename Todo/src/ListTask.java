import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTask {
    public List getList() {
        List<String> content = new ArrayList<>();

        try {
            Path path = Paths.get("C:\\Users\\bauer\\MakeTodo\\Deyso-todo-app\\Todo\\todoList.txt");
            List<String> lines = Files.readAllLines(path);
            content = lines;

        } catch (Exception e) {
            System.out.println("File does not exist!");
        }
        return content;
    }

}
