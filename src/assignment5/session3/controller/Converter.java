package assignment5.session3.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/Converter")
public class Converter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Converter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//here we are using doGet() method to generate html form
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Currency Converter</title>");
	    out.println("</head>");
	    out.println("<body bgcolor=\"white\">");
	    out.println("<form action=\"/Assignment5.3/Converter\" method=\"post\">");
	    out.println("Convert INR to USD:&nbsp;");
	    out.println("<input type=\"text\" name=\"currency\">");
	    out.println("<input type=\"submit\" value=\"Submit\">");
	    out.println("</form>");
	    out.println("</body>");
	    out.println("</html>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//calling doPost() method through html form
		response.setContentType("text/html");
		String name = request.getParameter("currency");
		int amount = Integer.parseInt(name);
        PrintWriter out  = response.getWriter();
        out.println("<h2>INR&nbsp;"+amount+"&nbsp;=&nbsp;USD&nbsp;"+convertCurrency("INR","USD",amount)+"</h2>");
    }
	
	private static int convertCurrency(String from, String to, int amount) {
		if(from.equals("INR")&& to.equals("USD"))
		{
			return 60*amount;
		}
		
		return 0;
          
    }

}
