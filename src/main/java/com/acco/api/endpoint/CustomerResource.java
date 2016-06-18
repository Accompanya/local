package com.acco.api.endpoint;

import com.acco.api.model.CustomerModel;
import com.acco.api.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Salman on 5/19/2016.
 */
@RestController
@RequestMapping("/customer")
public class CustomerResource {

    @Autowired
    private CustomerService service;

    @RequestMapping(value = "/new" , method = RequestMethod.POST)
    public CustomerModel createCustomer(@RequestBody CustomerModel customer) {
        try {
            service.registerCustomer(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customer;

    }

    @RequestMapping(value ="/find" , method = RequestMethod.GET)
    public CustomerModel findCustomer(@RequestParam("id") String id) {
        CustomerModel result = service.findCustomerById(id);
        return result;
    }


}
