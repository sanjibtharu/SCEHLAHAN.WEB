package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.entity.User;
public class UserDao {
	private Connection conn;
	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}
	public boolean register(User u) {
		boolean f = false;
		try {
			String sql = "insert into user_test(full_name,user_name,password) values(?,?,?) ";
					PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, u.getFullName());
			ps.setString(2, u.getUserName());
			ps.setString(3, u.getPassword());
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
  		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public User login(String user_name, String psw) {
		User u = null;
		try {
			String sql = "select * from user_test where user_name=? and password=?";
							PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user_name);
			ps.setString(2, psw);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new User();
				u.setId(rs.getInt(1));
				u.setFullName(rs.getString(2));
				u.setUserName(rs.getString(3));
				u.setPassword(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
	public boolean checkOldPassword(int userid, String oldPassword) {
		boolean f = false;
		try {
			String sql = "select * from user_test where id=? and password=?";
							PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userid);
			ps.setString(2, oldPassword);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public boolean changePassword(int userid, String newPassword) {
		boolean f = false;
		try {
			String sql = "update user_test set password=? where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, newPassword);
			ps.setInt(2, userid);
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}