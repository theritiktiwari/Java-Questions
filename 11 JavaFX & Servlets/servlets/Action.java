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
