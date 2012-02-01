package fr.xebia.katas.gildedrose.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.xebia.katas.gildedrose.Inn;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 2919717921232336957L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String numDayString=req.getParameter("numDay");
		Integer numDay=new Integer(0);
		if(numDayString!=null){
			try {
				numDay=new Integer(numDayString);
			}
			catch(NumberFormatException e){
				
			}
		}
		
		Inn inn = new Inn();
		for(int i=0;i<numDay;i++)
			inn.updateQuality();
		
		req.setAttribute("items", inn.getItems());
		req.setAttribute("numDay", numDay);
		req.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(req, resp);
	}
	

}
