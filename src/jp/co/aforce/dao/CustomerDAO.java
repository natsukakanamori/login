package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.bean.Customer;

public class CustomerDAO extends DAO{
	public Customer search(String login,String passward)
		throws Exception{
		Customer customer =null;

		Connection con=getConnection();

		PreparedStatement st;
		st=con.prepareStatement(
			"select * from customer where login=? and passward=?");
		st.setString(1, login);
		st.setString(2,passward);
		ResultSet rs=st.executeQuery();

		while(rs.next()) {
			customer=new Customer();
			customer.setId(rs.getInt("id"));
			customer.setLogin(rs.getString("login"));
			customer.setPassward(rs.getString("passward"));
		}

		st.close();
		con.close();
		return customer;
	}

}
