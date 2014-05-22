package kr.co.tdc.model;

import lombok.Data;

@Data
public class Board {
	private Integer board_id;
	private String title;
	private String content;
	private String create_user;
	private String modify_user;
	
}
