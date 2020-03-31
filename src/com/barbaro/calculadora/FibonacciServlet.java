package com.barbaro.calculadora;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class FibonacciServlet extends HttpServlet{
	
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
		
		int primero = 0, segundo = 1, tercero = 0;
		
		salida.println("<h4>Termino 0: " + primero + "</h4>");
		salida.println("<h4>Termino 1: " + segundo + "</h4>");
		
		for(int i = 2; i <= n1; i++) {
			tercero = primero + segundo;
			primero = segundo;
			segundo = tercero;
			
			salida.println("<h4>Termino " + i + ": " + tercero + "</h4>");
		}
		
	}

}
