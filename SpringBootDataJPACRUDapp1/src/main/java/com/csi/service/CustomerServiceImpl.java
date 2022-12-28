package com.csi.service;

import com.csi.dao.CustomerDaoImpl;
import com.csi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl {

    @Autowired
    CustomerDaoImpl customerDaoimpl;

    public Customer saveData(Customer customer){
        return  customerDaoimpl.saveData(customer);
    }

    public List<Customer> getAllData(){
        return  customerDaoimpl.getAllData();
    }

    public  Customer updateData(Customer customer){
        return customerDaoimpl.updateData(customer);
    }

    public void deleteData(int custId){
        customerDaoimpl.deleteData(custId);

    }

}
