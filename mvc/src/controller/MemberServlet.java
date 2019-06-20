package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.vo.MemberVO;

/**
 * Servlet implementation class EduServlet
 */
@WebServlet("/login")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberVO mv = new MemberVO();
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		mv.setName(request.getParameter("name"));
		mv.setId(request.getParameter("id"));
		mv.setPhone(request.getParameter("phone"));
		mv.setPassword(request.getParameter("password"));
		request.setAttribute("mv", mv);
		request.getRequestDispatcher("/jspexam/memberView.jsp").forward(request, response);
	}

}
