package com.controllers;
import com.dto.Customer;
import com.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewCustomer(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email) {

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customerRepository.save(customer);
        return "User Created";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable < Customer > getAllCustomers() {
        return customerRepository.findAll();
    }

}
