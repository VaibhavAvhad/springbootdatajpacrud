package com.csi.controller;

import com.csi.model.Customer;
import com.csi.service.CustomerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;

    @PostMapping("/savedata")
    public  ResponseEntity<Customer>saveData(@RequestBody  Customer customer){
      log.info("##Saving Data For Customer: "+customer.getCustName());
        return ResponseEntity.ok( customerService.saveData(customer));
    }


    @GetMapping("/getdata")
    public  ResponseEntity<List<Customer>>getAllData(){
        log.info("List Size: "+customerService.getAllData().size());
        return  ResponseEntity.ok(customerService.getAllData());
    }

    @PutMapping("/updateData/{cust_Id}")
 public  ResponseEntity<Customer>updateData(@PathVariable int custId, @RequestBody Customer customer){
        //
        return  ResponseEntity.ok(customerService.updateData(customer));
    }

    @DeleteMapping("/deletedata/{cust_Id}")
    public ResponseEntity<String>deleteData(@PathVariable int custId){
        customerService.deleteData(custId);
        return  ResponseEntity.ok("Data Deleted Successfuly");
    }
}
