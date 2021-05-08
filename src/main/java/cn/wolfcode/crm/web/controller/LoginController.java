package cn.wolfcode.crm.web.controller;

import cn.wolfcode.crm.service.IEmployeeService;
import cn.wolfcode.crm.util.JsonResult;
import cn.wolfcode.crm.util.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("login2")
    @ResponseBody
    public JsonResult index(String username, String password) {
        JsonResult result = new JsonResult();
        try {
            employeeService.checkEmployee(username, password);
        } catch (MyException e) {
            e.printStackTrace();
            result.markMsg(e.getMessage());
        }
        return result;
    }

    @RequestMapping("login")
    public String login() {
        return "redirect:/login.jsp";
    }


}


