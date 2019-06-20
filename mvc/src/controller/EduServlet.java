package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EduServlet
 */
@WebServlet("/score")
public class EduServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EduServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		int score = Integer.parseInt(request.getParameter("score"));
		switch (score / 10) {
		case 10:
		case 9:
			response.sendRedirect("/mvc/jspexam/gradeA.jsp?name=" + name + "");
			break;
		case 8:
			response.sendRedirect("/mvc/jspexam/gradeB.jsp?name=" + name + "");
			break;
		case 7:
			response.sendRedirect("/mvc/jspexam/gradeC.jsp?name=" + name + "");
			break;
		default:
			response.sendRedirect("/mvc/jspexam/gradeD.jsp?name=" + name + "");
			break;
		}
	}

}
