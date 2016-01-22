package com.springsource.samples.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.*;


@Controller
@RequestMapping("/rest/customers")
class CustomerRestController {

    @RequestMapping(method = GET)
    @ResponseBody
    public Customer showCustomers(Model model) {
        return new Customer("rod","song");
    }


    @RequestMapping(method = POST)
    @ResponseStatus(CREATED)
    public void createCustomer(@RequestBody Customer customer,
            HttpServletResponse response) {

        response.setHeader("Location", String.format("/rest/customers/%s",
                customer.getFirstname()));
    }


    @RequestMapping(value = "/{id}", method = GET)
    @ResponseBody
    public Customer showCustomer(@PathVariable int id) {

        return new Customer("rod","song");
    }


    @RequestMapping(value = "/{id}", method = PUT)
    @ResponseStatus(OK)
    public void updateCustomer(@RequestBody Customer customer) {

    }


    @RequestMapping(value = "/{id}", method = DELETE)
    @ResponseStatus(OK)
    public void deleteCustomer(@PathVariable int id) {
        // do delete
    }
}
