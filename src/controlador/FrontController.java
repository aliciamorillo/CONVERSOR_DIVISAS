package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		procesarPeticion(request, response);
	}

	protected void procesarPeticion(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("--> FRONT CONTROLLER");
		
		String pathPeticion = request.getServletPath();
		
		String cantidad = request.getParameter("cajaCantidad");
		System.out.println("\n- CANTIDAD REQUEST = " + cantidad);
		
		pathPeticion = pathPeticion.substring(0, pathPeticion.lastIndexOf("."));
		
		request.getRequestDispatcher(pathPeticion).forward(request, response);
	}
}
