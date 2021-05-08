package cn.wolfcode.crm.service;

import cn.wolfcode.crm.domain.Employee;

import java.util.List;

public interface IEmployeeService {
    /**
     * 删除员工
     * @param id //需要删除的员工id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加员工
     * @param record //需要添加的员工
     */
    int insert(Employee record);

    /**
     * 根据id查询员工
     * @param id
     */
    Employee selectByPrimaryKey(Long id);

    /**
     * 查询所有员工
     * @return
     */
    List<Employee> selectAll();

    /**
     * 更新员工
     * @param record
     */
    int updateByPrimaryKey(Employee record);

    /**
     * 根据用户名,和密码查询当前登录的员工
     * @param username
     * @param password
     */
    public void checkEmployee(String username, String password);

}
