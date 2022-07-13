package testando;



import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/hora")
public class MinhaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		java.util.Date agora = new java.util.Date();
		out.println("<html><head><meta charset=\"ISO-8859-1\"></head><body>A data/hora atual é " + agora + "</body></html>");
	}
}
