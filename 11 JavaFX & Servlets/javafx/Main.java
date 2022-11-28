import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField TF1 = new TextField();
        TextField TF2 = new TextField();
        TextField TF3 = new TextField();

        ComboBox CB1 = new ComboBox();
        CB1.getItems().add("Cyber Physical System");
        CB1.getItems().add("AI & ML");
        CB1.getItems().add("AI & Robotics");
        CB1.getItems().add("CSE Core");

        ComboBox CB2 = new ComboBox();
        CB2.getItems().add("Sem 1");
        CB2.getItems().add("Sem 2");
        CB2.getItems().add("Sem 3");
        CB2.getItems().add("Sem 4");
        CB2.getItems().add("Sem 5");
        CB2.getItems().add("Sem 6");
        CB2.getItems().add("Sem 7");
        CB2.getItems().add("Sem 8");

        Label L1 = new Label("Name : ");
        Label L2 = new Label("Register Number : ");
        Label L3 = new Label("Department : ");
        Label L4 = new Label("Semester : ");
        Label L5 = new Label("CGPA : ");

        Button btn = new Button("Submit");
        btn.setOnAction(e -> System.out.println(
                "You entered\nName: " + TF1.getText() + "\nRegister Number: " + TF2.getText() + "\nDepartment: "
                        + CB1.getValue() + "\nSemester: " + CB2.getValue() + "\nCGPA: " + TF3.getText()));

        GridPane root = new GridPane();
        root.setPadding(new Insets(20, 20, 20, 20));
        root.addRow(0, L1, TF1);
        root.addRow(1, L2, TF2);
        root.addRow(2, L3, CB1);
        root.addRow(3, L4, CB2);
        root.addRow(4, L5, TF3);
        root.addRow(5, btn);
        root.setHgap(10);
        root.setVgap(10);

        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.setTitle("Student Details");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}