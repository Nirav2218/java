package com.nirav.lms.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.nirav.lms.Admin.Admin;
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
		
		public Admin getadmin(String mail){    
		    String sql="select * from admin where a_mail=?";    
		    return this.templet.queryForObject(sql, (rs,row)->{
		    	return new Admin(rs.getString("a_mail"),rs.getString("a_pass"));
		    },mail);
		}
		
		public int Read(User user) {
			String pass = user.getU_password();
			String qry="select * from users where u_mail=?";
			RowMapper<User> rm= new BeanPropertyRowMapper<>(User.class);
			try {
			String dbpass=	templet.queryForObject(qry,rm,user.getU_mail()).getU_password();
			if (dbpass.equals(pass)) {
					return 1;
				} else  {
					return 2;
				}
			} catch (Exception e) {
				return 3;
			}				
		}
}
