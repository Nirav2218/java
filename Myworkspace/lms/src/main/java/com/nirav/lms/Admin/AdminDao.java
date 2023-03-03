package com.nirav.lms.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {
	@Autowired
	private JdbcTemplate temp;
	public Admin getadmin(String mail){    
	    String sql="select * from admin where a_mail=?";    
	    return this.temp.queryForObject(sql, (rs,row)->{
	    	return new Admin(rs.getString("a_mail"),rs.getString("a_pass"));
	    },mail);
	}
	
	
}
