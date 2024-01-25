package com.nekos.cruddemo.service;

import com.nekos.cruddemo.dao.EmployeeDAO;
import com.nekos.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

   private EmployeeDAO employeeDAO;

   @Autowired
   public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){
       this.employeeDAO = theEmployeeDAO;
   }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        Employee employee = employeeDAO.save(theEmployee);

        return employee;
    }

    @Override
    @Transactional
    public void deleteById(int theId) {

       employeeDAO.deleteById(theId);

    }


}
