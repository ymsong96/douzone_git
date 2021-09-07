package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/Update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateServlet() {
        super();
        System.out.println("생성자 Call");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[ Update doGet ]");	
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("Text/html; charset=UTF-8");
		
		String id=request.getParameter("id");
		
		ListServlet.userlist.set(ListServlet.userlist.indexOf(id), id+"수정");

		System.out.println("[ 회원 수정 ]");
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
			out.println("<head>");
			out.println("</head>");

			out.println("<body>");
				out.println("<h1>" + id + " 의 ID가 목록이 수정 되었습니다!</h1>");
				out.println("<a href = 'index.html'>HOME</a>");
			out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("[ Update doPost ] ");
	}

}
