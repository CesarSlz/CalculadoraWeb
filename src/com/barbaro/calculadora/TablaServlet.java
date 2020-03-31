package com.barbaro.calculadora;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class TablaServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String numero = request.getParameter("txtNumero");
		int n1 = Integer.parseInt(numero);
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		for(int i=1; i <= 10; i++) {
		salida.println("<h4>"+ n1 + " * "  + i + " = " + n1*i + "</h4>");
		}
	}
}
