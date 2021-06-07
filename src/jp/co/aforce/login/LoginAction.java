package jp.co.aforce.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.bean.Customer;
import jp.co.aforce.dao.CustomerDAO;
import tool.Action;

public class LoginAction extends Action{
	public String execute(
			HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		HttpSession session = request.getSession();

		String login = request.getParameter("login");
		String passward = request.getParameter("passward");
		CustomerDAO dao=new CustomerDAO();
		Customer customer=dao.search(login, passward);

		if(customer!=null) {
			session.setAttribute("customer", customer);
			return "../jsp/success.jsp";
		}
		request.setAttribute("idが違います。", customer);
		return "../jsp/login.jsp";


	}

}
