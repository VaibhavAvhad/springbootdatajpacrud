package com.csi.dao;

import com.csi.model.Customer;
import com.csi.repo.CustomerRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDaoImpl {

    @Autowired
    CustomerRepoImpl customerRepo;

    public Customer saveData(Customer customer){
        return  customerRepo.save(customer);
    }

    public List<Customer> getAllData(){
       return  customerRepo.findAll();
    }

    public  Customer updateData(Customer customer){
        return customerRepo.save(customer);
    }

    public void deleteData(int custId){
        customerRepo.deleteById(custId);
    }
}
