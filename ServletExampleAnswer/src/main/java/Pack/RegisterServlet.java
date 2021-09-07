package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterServlet() {
        super();
        System.out.println("생성자 Call");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[ Regiseter doGet]");	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("[ Regiseter doPost ]");	
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("Text/html; charset=UTF-8"); 
		
		String id = request.getParameter("id");
		System.out.println("[ ID 데이터 수신 및 가입 완료 : " + id + " ]" );
		
		ListServlet.userlist.add(id);
		
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
			out.println("<head>");
			out.println("</head>");

			out.println("<body>");
				out.println("<h1>"+ id +" 가입이 완료 되었습니다!</h1>");
				out.println("<h1>"+ id +" 가입이 완료 되었습니다!</h1>");
			out.println("</body>");
		out.println("</html>");
		out.close();
	}

}