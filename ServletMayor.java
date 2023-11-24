package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletMayor
 */
public class ServletMayor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMayor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int mayor=0;
		int num1=Integer.parseInt(request.getParameter("num1")) ;
		System.out.println("Numero 1: " + num1);
		int num2=Integer.parseInt(request.getParameter("num2")) ;
		System.out.println("Numero 2: " + num2);
		int num3=Integer.parseInt(request.getParameter("num3")) ;
		System.out.println("Numero 3: " + num3);
		if(num1>num2 && num1>num3) {
			mayor=num1;
		PrintWriter out = response.getWriter();
	     out.println("El mayor de los tres es el numero: " + mayor);
		}
		else if(num2>num1 && num1>num3) {
			mayor=num2;
		PrintWriter out = response.getWriter();
	     out.println("El mayor de los tres es el numero: " + mayor);
		}
		else if(num3>num2 && num3>num1) {
			mayor=num3;
		PrintWriter out = response.getWriter();
	     out.println("El mayor de los tres es el numero: " + mayor);
		}
		else {
			PrintWriter out = response.getWriter();
		     out.println("Los numeros son iguales"); 
		     
		}
		System.out.println(mayor);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
