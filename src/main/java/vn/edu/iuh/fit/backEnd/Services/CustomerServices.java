package vn.edu.iuh.fit.backEnd.Services;


import vn.edu.iuh.fit.backEnd.models.Customer;
import vn.edu.iuh.fit.backEnd.repositories.CustomerRepository;

import java.util.List;

public class CustomerServices {
    private final CustomerRepository repository = new CustomerRepository();

    public CustomerServices() {
//        repository = new CustomerRepository();
    }

    public void insertCust(Customer customer) {
        repository.insertCust(customer);
    }

    public List<Customer> getAll() {
        return repository.getAllCust();
    }
}