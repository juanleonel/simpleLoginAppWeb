package LoginSimpleWebApp.book.jee_eclipse.book.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().write(CreateForm(null));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		//create StringBuilder to hold response string
		StringBuilder responseStr = new StringBuilder();
		if ("admin".equals(userName) && "admin".equals(password)) {
		responseStr.append("<h2>Welcome admin !</h2>")
		.append("You are successfully logged in");
		}
		else {
		//invalid user credentials
		responseStr.append(CreateForm("Invalid user id or password.	Please try again"));
		}
		response.getWriter().write(responseStr.toString());
	}
	
	protected String CreateForm(String errMsg) {
		
		StringBuilder sb = new StringBuilder("<h2> Login </h2>");
		
		if (errMsg != null) {
			sb.append("<span style='color: red' >")
				.append(errMsg)
				.append("</span>");
		}
		
		// crea el formulario
		
		sb.append("<form method='post'>\n")
				.append("User Name: <input type='text' name='userName'><br>\n")
				.append("Password: <input type='password' name='password'><br>\n")
				.append("<button type='submit' name='submit'>Submit</button>\n")
				.append("<button type='reset'>Reset</button>\n")
				.append("</form>");
		
	
		return sb.toString();
		
	}

}
