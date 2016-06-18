package com.acco;

import com.acco.entity.AccompaniaCustomer;
import com.acco.repo.MongoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Salman on 5/19/2016.
 */
@SpringBootApplication
public class Application{

    /*@Autowired
    MongoEntityRepository repo;*/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*@Override
    public void run(String... strings) throws Exception {
        //repo.deleteAll();
        AccompaniaCustomer customer = new AccompaniaCustomer("toke-from-stripe-12123424");
        customer.setEmail("myNewCustmer@email.com");
        customer.setFirstName("asghar");
        customer.setLastName("jafar");
        customer.setContactNumber("21548799");
        repo.save(customer);

        System.out.println("--------------------------------");

        AccompaniaCustomer retreived = (AccompaniaCustomer) repo.findOne("toke-from-stripe-12123424");

        if(retreived != null) {
            System.out.println("--------------------------------");
            System.out.println(retreived.getEmail());
        } else {
            System.out.println("fuuuuuuuuuuuuuuuuuuuuuuuuckkk");
        }

    }*/
}
