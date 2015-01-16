package kr.co.tdc.model;

import java.util.Date;

public class User {
   private String user_id;
   private String user_password;
   private String user_email;
   private String user_name;
   private Date create_date;
   private Date modify_date;
   /**
    * @return the user_id
    */
   public String getUser_id() {
      return user_id;
   }
   /**
    * @param user_id the user_id to set
    */
   public void setUser_id(String user_id) {
      this.user_id = user_id;
   }
   /**
    * @return the user_password
    */
   public String getUser_password() {
      return user_password;
   }
   /**
    * @param user_password the user_password to set
    */
   public void setUser_password(String user_password) {
      this.user_password = user_password;
   }
   /**
    * @return the user_email
    */
   public String getUser_email() {
      return user_email;
   }
   /**
    * @param user_email the user_email to set
    */
   public void setUser_email(String user_email) {
      this.user_email = user_email;
   }
   /**
    * @return the user_name
    */
   public String getUser_name() {
      return user_name;
   }
   /**
    * @param user_name the user_name to set
    */
   public void setUser_name(String user_name) {
      this.user_name = user_name;
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
      result = prime * result + ((create_date == null) ? 0 : create_date.hashCode());
      result = prime * result + ((modify_date == null) ? 0 : modify_date.hashCode());
      result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
      result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
      result = prime * result + ((user_name == null) ? 0 : user_name.hashCode());
      result = prime * result + ((user_password == null) ? 0 : user_password.hashCode());
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
      User other = (User) obj;
      if (create_date == null) {
         if (other.create_date != null)
            return false;
      } else if (!create_date.equals(other.create_date))
         return false;
      if (modify_date == null) {
         if (other.modify_date != null)
            return false;
      } else if (!modify_date.equals(other.modify_date))
         return false;
      if (user_email == null) {
         if (other.user_email != null)
            return false;
      } else if (!user_email.equals(other.user_email))
         return false;
      if (user_id == null) {
         if (other.user_id != null)
            return false;
      } else if (!user_id.equals(other.user_id))
         return false;
      if (user_name == null) {
         if (other.user_name != null)
            return false;
      } else if (!user_name.equals(other.user_name))
         return false;
      if (user_password == null) {
         if (other.user_password != null)
            return false;
      } else if (!user_password.equals(other.user_password))
         return false;
      return true;
   }
   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
      return "User [user_id=" + user_id + ", user_password=" + user_password + ", user_email=" + user_email + ", user_name=" + user_name + ", create_date="
            + create_date + ", modify_date=" + modify_date + "]";
   }

}
