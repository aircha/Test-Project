package kr.co.tdc.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
   private String user_id;
   private String user_password;
   private String user_email;
   private String user_name;
   private Date create_date;
   private Date modify_date;
}
