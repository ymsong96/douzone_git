package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteServlet() {
		super();
		System.out.println("생성자 Call");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");

		request.setCharacterEncoding("UTF-8");
		response.setContentType("Text/html; charset=UTF-8");

		String id=request.getParameter("id");

		ListServlet.userlist.remove(id);


		System.out.println("[ " + id + "회원 삭제됨 ]");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>" + id + " 의 ID가 목록이 삭제 되었습니다!</h1>");
		out.println("<a href = 'index.html'>HOME</a>");
		out.println("<script>alert('" + id + "님 탈퇴가 완료되었습니다" + "');window.self.location = '/';</script>");
		out.println("</body>");
		out.println("</html>");
		out.close();


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}