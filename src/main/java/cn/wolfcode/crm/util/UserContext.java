package cn.wolfcode.crm.util;

import cn.wolfcode.crm.domain.Employee;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

/**
 * @author Makol
 * @time   2018年6月23日 下午7:40:18
 * @email  Administrator@qq.com
 * @description 
 */

//暂时使用session获取员工登录,后续改用shiro
public abstract class UserContext {
	
	public static final String EMPLOYEE_IN_SESSION = "employee_in_session";

	public static HttpSession getSession(){
		RequestAttributes requestAttributes1 = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes  requestAttributes = (ServletRequestAttributes)requestAttributes1;
		return requestAttributes.getRequest().getSession();
	}
	
	public static void setCurrentuser(Employee currentEmployee){
		getSession().setAttribute(EMPLOYEE_IN_SESSION, currentEmployee);
	}

	
	public static Employee getCurrentuser(){
		return (Employee)getSession().getAttribute(EMPLOYEE_IN_SESSION);
	}

}
