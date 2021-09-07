package Pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/List")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static LinkedList<String> userlist = new LinkedList<String>();    
	
    public ListServlet() {
        super();
        System.out.println("생성자 Call");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[ List doGet ]");	
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("Text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter(); 
		
		out.println("<html>");

		out.println("<body>");
		
		out.println("<table border='1' , width='700'>");
		//제목 부분
		out.println("<tr bgcolor='#ffff00'>");
		out.println("<td>아이디</td>");
		out.println("<td>삭제</td>");
		out.println("<td>수정</td>");
		out.println("</tr>");
		
		for(String username : userlist) {
			out.println("<tr>");
			out.println("<td>"+ username +"</td>");
			out.println("<td><a href=\'Delete?id=" + username + "'>삭제</a></td>");
			out.println("<td><a href=\'Update?id=" + username + "'>수정</a></td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("<a href = 'index.html'>HOME</a>");
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("[ List doGet ]");	
	}

}