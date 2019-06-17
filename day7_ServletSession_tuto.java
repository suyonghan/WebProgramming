package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/basket2")
public class BasketServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BasketServlet2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pid = request.getParameter("football_club");
		String delete = request.getParameter("delete");
		if (delete != null && delete.equals("yes")) {
			HttpSession session = request.getSession();
			session.removeAttribute("pid");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("모두 삭제되었습니다.");
			out.print("<br><a href = '../sedu/html/productlog2.html'>상품 선택화면</a>");
		} else {
			HashMap<String, Integer> hm = null;
			HttpSession session = request.getSession();

			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("선택한 상품 리스트<br>");
			out.print("--------------------------<br>");

			if (session.getAttribute("pid") == null) { // data로 보관된 객체가 없다
				session.setAttribute("pid", new HashMap<String, Integer>());
			}
			hm = (HashMap<String, Integer>) session.getAttribute("pid");
			if (hm.containsKey(pid)) {
				hm.put(pid, hm.get(pid) + 1);
			} else {
				hm.put(pid, 1);
			}
			if (!hm.isEmpty() && hm.size() > 0) {
				out.print("<ul>");
				for (String k : hm.keySet()) {
					out.print("<li> " + k + " 상품 " + hm.get(k) + "개</li>");
				}
				out.print("</ul>");

			}
			out.print("<br><a href = '../sedu/html/productlog2.html'>상품 선택화면</a>   ");
			out.print("<a href = '../sedu/basket2?delete=yes'>상품 비우기</a>");
			out.close();
		}
	}

}
