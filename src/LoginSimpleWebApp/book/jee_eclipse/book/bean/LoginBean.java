package LoginSimpleWebApp.book.jee_eclipse.book.bean;

public class LoginBean {
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public boolean isValidUser() {		
		// Validacion para un numero de recursos
		
		return "admin".equals(this.userName) && "admin".equals(this.password);
	}
	
	
}
