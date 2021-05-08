package cn.wolfcode.crm.util;

/**
 * @author Makol
 * @time   2018年6月21日 上午11:01:22
 * @email  Administrator@qq.com
 * @description 
 */

//自己定义的异常类
public class MyException extends RuntimeException{

	private static final long serialVersionUID = -4117054967414039038L;

	public MyException() {
		super();
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyException(String message) {
		super(message);
	}
	
}
