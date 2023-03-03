package com.nirav.lms.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	@Autowired
	 private JdbcTemplate templet;
		public int Insert(User u) {
			String qry="insert into users(u_mail,u_name,u_password) values(?,?,?);";
			int rs= this.templet.update(qry,u.getU_mail(),u.getU_name(),u.getU_password());
			return rs;
		}
		public int Update(User u) {
		    String qry="update users set u_name=?,u_password=? where  u_mail=? ";  
			int rs = this.templet.update(qry,u.getU_name(),u.getU_password(),u.getU_mail());
			return rs;
		}
}
