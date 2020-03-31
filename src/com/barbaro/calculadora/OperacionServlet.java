package com.barbaro.calculadora;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class OperacionServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String numero1 = request.getParameter("txtNumero1");
		String numero2 = request.getParameter("txtNumero2");
		
		if(numero2 == "") {
			numero2 = "0";
		}
		
		String operacion = request.getParameter("tipo");
		
		int n1 =  Integer.parseInt(numero1);
		int n2 = Integer.parseInt(numero2);
		int resultado = 0;
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		
		switch(operacion) {
			case "suma":
				resultado = n1 + n2;
				break;
			case "resta":
				resultado = n1 - n2;
				break;
			case "multi":
				resultado = n1 * n2;
				break;
			case "div":
				resultado = n1 / n2;
				break;
			case "potencia":
				resultado = (int)Math.pow(n1, n2);
				break;
			case "factorial":
				for(int i = (n1-1); i > 0; i--) {
					n1 *= i;
				}
				resultado = n1;
				break;
		}
		
		salida.println("<h2>Resultado: " + resultado + "</h2>");
	}
}
