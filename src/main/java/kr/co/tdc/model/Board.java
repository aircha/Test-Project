package kr.co.tdc.model;

import java.util.Date;

public class Board {
   private Integer board_id;
   private String title;
   private String content;
   private String create_user;
   private String modify_user;
   private Date create_date;
   private Date modify_date;
   /**
    * @return the board_id
    */
   public Integer getBoard_id() {
      return board_id;
   }
   /**
    * @param board_id the board_id to set
    */
   public void setBoard_id(Integer board_id) {
      this.board_id = board_id;
   }
   /**
    * @return the title
    */
   public String getTitle() {
      return title;
   }
   /**
    * @param title the title to set
    */
   public void setTitle(String title) {
      this.title = title;
   }
   /**
    * @return the content
    */
   public String getContent() {
      return content;
   }
   /**
    * @param content the content to set
    */
   public void setContent(String content) {
      this.content = content;
   }
   /**
    * @return the create_user
    */
   public String getCreate_user() {
      return create_user;
   }
   /**
    * @param create_user the create_user to set
    */
   public void setCreate_user(String create_user) {
      this.create_user = create_user;
   }
   /**
    * @return the modify_user
    */
   public String getModify_user() {
      return modify_user;
   }
   /**
    * @param modify_user the modify_user to set
    */
   public void setModify_user(String modify_user) {
      this.modify_user = modify_user;
   }
   /**
    * @return the create_date
    */
   public Date getCreate_date() {
      return create_date;
   }
   /**
    * @param create_date the create_date to set
    */
   public void setCreate_date(Date create_date) {
      this.create_date = create_date;
   }
   /**
    * @return the modify_date
    */
   public Date getModify_date() {
      return modify_date;
   }
   /**
    * @param modify_date the modify_date to set
    */
   public void setModify_date(Date modify_date) {
      this.modify_date = modify_date;
   }
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((board_id == null) ? 0 : board_id.hashCode());
      result = prime * result + ((content == null) ? 0 : content.hashCode());
      result = prime * result + ((create_date == null) ? 0 : create_date.hashCode());
      result = prime * result + ((create_user == null) ? 0 : create_user.hashCode());
      result = prime * result + ((modify_date == null) ? 0 : modify_date.hashCode());
      result = prime * result + ((modify_user == null) ? 0 : modify_user.hashCode());
      result = prime * result + ((title == null) ? 0 : title.hashCode());
      return result;
   }
   /* (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Board other = (Board) obj;
      if (board_id == null) {
         if (other.board_id != null)
            return false;
      } else if (!board_id.equals(other.board_id))
         return false;
      if (content == null) {
         if (other.content != null)
            return false;
      } else if (!content.equals(other.content))
         return false;
      if (create_date == null) {
         if (other.create_date != null)
            return false;
      } else if (!create_date.equals(other.create_date))
         return false;
      if (create_user == null) {
         if (other.create_user != null)
            return false;
      } else if (!create_user.equals(other.create_user))
         return false;
      if (modify_date == null) {
         if (other.modify_date != null)
            return false;
      } else if (!modify_date.equals(other.modify_date))
         return false;
      if (modify_user == null) {
         if (other.modify_user != null)
            return false;
      } else if (!modify_user.equals(other.modify_user))
         return false;
      if (title == null) {
         if (other.title != null)
            return false;
      } else if (!title.equals(other.title))
         return false;
      return true;
   }
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
      return "Board [board_id=" + board_id + ", title=" + title + ", content=" + content + ", create_user=" + create_user + ", modify_user=" + modify_user
            + ", create_date=" + create_date + ", modify_date=" + modify_date + "]";
   }

}
