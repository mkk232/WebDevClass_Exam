package com.koreait.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Utils {
	public static void forward(String target, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String jsp = "/WEB-INF/jsp/" + target + ".jsp";
		String jsp = String.format("/WEB-INF/jsp/%s.jsp", target);
		request.getRequestDispatcher(jsp).forward(request, response);
	}

}
