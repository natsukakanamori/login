package jp.co.aforce.bean;

public class Customer implements java.io.Serializable {

	private int id;
	private String login;
	private String passward;

	public int getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getPassward() {
		return passward;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}
}