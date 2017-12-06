package com.me.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.me.springmvc.model.User;

public class UserDAOImpl implements UserDAO {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public int save(User u){  
	    String sql="insert into Emp99(first_name, last_name, email, education, gender, birthday) values('"+u.getFirst_name()+"',"+u.getLast_name()+",'"+u.getEmail()+"',"+u.getEducation()+"',"+u.getGender()+"',"+u.getBirthday()+"')";  
	    return template.update(sql);  
	}
	public User getUserById(int id) {
		String sql = "select * from users where id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<User>(User.class));
	}

	public List<User> getUsers() {
		return template.query("select * from users", new RowMapper<User>() {
			public User mapRow(ResultSet rs, int row) throws SQLException {
				User e = new User();
				e.setId(rs.getLong(1));
				e.setFirst_name(rs.getString(2));
				e.setLast_name(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setEducation(rs.getString(5));
				e.setGender(rs.getString(6));
				e.setBirthday(rs.getString(7));
				return e;
			}
		});
	}

}
