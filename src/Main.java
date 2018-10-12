import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main {

    public static void main(String[] args) {

        Print("Simulate an edit from another team member...");
    }
    private static void Print(String s) {
        System.out.print(s);
    }
    private static void Print(Stage stage, String s) {
        Stage UIViewStage = null;
        Group UIViewRoot;
        Scene UIViewScene;

        // Set the Scene
        UIViewRoot = new Group();
        UIViewScene = new Scene(UIViewRoot);

        UIViewStage.setScene(UIViewScene);
        UIViewStage = stage;
        UIViewStage.setTitle("Canvas Example");
        Add_Text("Hello World!", 10, 40);
        UIViewStage.show();
    }
    private static void Add_Text(String msg, int l, int w) {
        // l = 10, w = 40, msg = "Hello World!"
        Text text = new Text(l, w, msg);
        text.setFont(new Font(w));
        Scene scene = new Scene(new Group(text));
    }
}
