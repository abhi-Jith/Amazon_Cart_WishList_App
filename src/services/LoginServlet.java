package services;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDaoService loginDaoService = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		loginDaoService = new LoginDaoService();

		String userName = req.getParameter("userName");
		String passWord = req.getParameter("password");

		System.out.println("======================================================");
		System.out.println("userName=" + userName);
		System.out.println("password=" + passWord);

		RequestDispatcher dispatcher = null;

		if (loginDaoService.validateUser(userName, passWord)) {
			HttpSession session = req.getSession();
			session.setAttribute("user", userName);
			resp.sendRedirect("Product.jsp");
			// dispatcher = req.getRequestDispatcher("productList.html");
			// dispatcher.forward(req, resp);
		} else {
			System.out.println("Invalid credentials." + "\n" + "Please enter the correct username and password.");
			dispatcher = req.getRequestDispatcher("index.html");
			dispatcher.forward(req, resp);
		}

	}

}
