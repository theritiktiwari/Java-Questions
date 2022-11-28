# JavaFX & Servlets

**Ques 1 :** Using javaFX design a login form that contains fields to get the student details Name, Registration Number, Department (DropDown), Semester (DropDown), CGPA. When the submit button is pressed all the details entered by the student should be printed in the console.

**Code :**

```java
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
```

**Ques 2 :** Create a Servlet to get the student details Name, Registration Number, Department (DropDown), Semester (DropDown), CGPA. When the submit button is pressed all the details entered by the student should be displayed in the same page along with the current date and time.

**Code :**

index.html

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input</title>
</head>
<body>
	<form action="action" method="post">  
		<input type="text" name="name" placeholder="Enter name"><br/><br/>
		<input type="text" name="register_number" placeholder="Enter register number"><br/><br/>
        <select name="department">
            <option value="Cyber Physical Systems">Cyber Physical Systems</option>
            <option value="AL & ML">AL & ML</option>
            <option value="AI & Robotics">AI & Robotics</option>
            <option value="CSE Core">CSE Core</option>
        </select><br/><br/>
        <select name="semester">
            <option value="Semester 1">Semester 1</option>
            <option value="Semester 2">Semester 2</option>
            <option value="Semester 3">Semester 3</option>
            <option value="Semester 4">Semester 4</option>
            <option value="Semester 5">Semester 5</option>
            <option value="Semester 6">Semester 6</option>
            <option value="Semester 7">Semester 7</option>
            <option value="Semester 8">Semester 8</option>
        </select><br/><br/>
		<input type="text" name="cgpa" placeholder="Enter CGPA"><br/><br/>
		<input type="submit" value="Submit">
	</form>
</body>
</html>
```

Action.java

```java
import java.servlet.ServletConfig;
import java.servlet.ServletException;
import java.servlet.http.Cookie;
import java.servlet.http.HttpServlet;
import java.servlet.http.HttpServletRequest;
import java.servlet.http.HttpServletResponse;
import java.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/action")
public class Action extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String register_number = req.getParameter("register_number");
		String department = req.getParameter("department");
		String semester = req.getParameter("semester");
		String cgpa = req.getParameter("cgpa");
        
        out.print("You entered <br/>");
        out.print("<br/> Name : " + name);
        out.print("<br/> Register Number : " + register_number);
        out.print("<br/> Department : " + department);
        out.print("<br/> Semester : " + semester);
        out.print("<br/> CGPA : " + cgpa);
		
        out.close();
	}
}
```
