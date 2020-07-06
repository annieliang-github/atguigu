package team.service;

//自定义异常类

public class TeamException extends Exception {
	static final long serialVersionUID = 33214658971L;
	public TeamException() {
		super();
	}
	public TeamException(String msg) {
		super(msg);
	}
}
