package cn.wolfcode.crm.service.impl;

import cn.wolfcode.crm.domain.Employee;
import cn.wolfcode.crm.mapper.EmployeeMapper;
import cn.wolfcode.crm.service.IEmployeeService;
import cn.wolfcode.crm.util.MyException;
import cn.wolfcode.crm.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper mapper;

    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    public int insert(Employee record) {
        return mapper.insert(record);
    }

    public Employee selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<Employee> selectAll() {
        return mapper.selectAll();
    }

    public int updateByPrimaryKey(Employee record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public void checkEmployee(String username, String password) {
        //登录检查
        Employee currentEmployee = mapper.checkEmployee(username, password);

        if (currentEmployee == null) {
            throw new MyException("账号或密码错误");
        }
        //把员工信息共享到session
        UserContext.setCurrentuser(currentEmployee);
    }
}
