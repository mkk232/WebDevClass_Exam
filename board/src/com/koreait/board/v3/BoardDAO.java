package com.koreait.board.v3;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	private List<BoardDTO> list;
	
	private static BoardDAO dao;
	
	public static BoardDAO getInstance() {
		if(dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}
	
	public BoardDAO() {
		list = new ArrayList();
		BoardDTO dto = new BoardDTO();
		dto.setI_board(1);
		dto.setTitle("제목");
		dto.setCtnt("내용");
		dto.setR_dt("11-27");
		
		list.add(dto);
	}
	
	public void insBoard(BoardDTO vo) {
		vo.setI_board(list.size() + 1);
		list.add(vo);
	}
	
	public List<BoardDTO> selBoardList() {
		return list;
	}
	
	public BoardDTO selBoard(int i_board) {
		for(BoardDTO dto : list) {
			if(dto.getI_board() == i_board) {
				return dto;
			}
		}
		return null;
	}
	public void delBoard(int i_board) {
		for(BoardDTO dto : list) {
			if(dto.getI_board() == i_board) {
				list.remove(dto);
				return;
			}
		}
	}
}



















