package controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.vo.ProductVO;

/**
 * Servlet implementation class EduServlet
 */
@WebServlet("/cart")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProductServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		String name = (String) request.getParameter("pid");
		System.out.println(name);
		if (name == null) {
			session.removeAttribute("product");
		} else {
			if (session.getAttribute("product") == null) {
				ProductVO vo = new ProductVO();
				vo.setInfo(name, 1);
				session.setAttribute("product", vo);
			} else {
				ProductVO temp = ((ProductVO) session.getAttribute("product"));
				temp.setInfo(name, 1);
				session.setAttribute("product", temp);
			}
			request.getRequestDispatcher("/jspexam/productView.jsp").forward(request, response);
		}
	}
}
