package kr.co.tdc.service;

import java.util.List;

import kr.co.tdc.model.Board;

public interface BoardService {
	List<Board> getBoardList(Board board);
	Board getBoardInfo(Board board);
}
