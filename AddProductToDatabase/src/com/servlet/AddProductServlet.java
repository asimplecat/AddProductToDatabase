package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.client.Client;
import com.entity.Products;

/**
 * Servlet implementation class addProductSerlvet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		if (request.getParameter("productid").equals("") || request.getParameter("productName").equals("") || request.getParameter("price").equals(""))
		{
			System.out.println("Id is " + request.getParameter("productid"));
			System.out.println("Name is " + request.getParameter("productName"));
			System.out.println("Price is " + request.getParameter("price"));
		}
		else {
			String id = request.getParameter("productid");
			String name = request.getParameter("productName");
			
			int price = Integer.parseInt(request.getParameter("price"));
			Products product = new Products(id , name, price);
			if (Client.addToDB(product))
			{
				request.getRequestDispatcher("index.jsp").include(request, response);
				out.println("<p style=\"color:blue\";>Product added to database</p>");
			}
		}
		
		
		
		
	}

}
