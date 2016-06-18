package com.acco.api.service;

import com.acco.api.model.CustomerModel;
import com.acco.constants.CustomerConstants;
import com.acco.entity.AccompaniaCustomer;
import com.acco.entity.Card;
import com.acco.repo.MongoEntityRepository;
import com.acco.stripe.StripeApiConstants;
import com.stripe.Stripe;
import com.stripe.exception.*;
import com.stripe.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Salman on 5/19/2016.
 */
@Service
public class CustomerService {

    @Autowired
    private MongoEntityRepository repository;

    public boolean registerCustomer(CustomerModel customer) throws Exception {
        Stripe.apiKey = StripeApiConstants.API_TEST_SECRET;

        Map<String, Object> customerParams = new HashMap<String, Object>();
        String customerDescription = customer.getFirstName() + " " + customer.getLastName();
        String customerEmail = customer.getEmail();
        String customerSource = customer.getCardId();
        customerParams.put(CustomerConstants.CustomerApiConstants.source.toString() , customerSource);
        customerParams.put(CustomerConstants.CustomerApiConstants.description.toString() , customerDescription);
        customerParams.put(CustomerConstants.CustomerApiConstants.email.toString() , customerEmail);

        try {
            Customer stripeCustomer = Customer.create(customerParams);
            AccompaniaCustomer newCustomer = AccompaniaCustomer.createEntity(stripeCustomer.getId() , customer);
            repository.save(newCustomer);
            Card card = new Card(customer.getCardId());
            card.setCustomerId(newCustomer.getId());
            repository.save(card);
            return true;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public CustomerModel findCustomerById(String id) {
        AccompaniaCustomer customer = (AccompaniaCustomer) repository.findOne(id);
        CustomerModel result = CustomerModel.fromEntity(customer);
        return result;
    }
}
