package com.koreait.board.v3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/v3/boardReg")
public class ServBoardReg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Utils.forward("boardReg_v3", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int i_board = Utils.getIntParam(request, "i_board");
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		String r_dt = request.getParameter("r_dt");
		
		System.out.println("i_board : " + i_board);
		System.out.println("title : " + title);
		System.out.println("ctnt : " + ctnt);
		System.out.println("t_dt : " + r_dt);
		
		BoardDTO dto = new BoardDTO();
		dto.setTitle(title);
		dto.setCtnt(ctnt);
		dto.setR_dt(r_dt);
		
		BoardDAO dao2 = BoardDAO.getInstance();
		dao2.insBoard(dto);
		
		response.sendRedirect("/v3/boardList");
	}

}
