package com.sky.customer;

import java.util.List;

public class InMemoryCustomerService implements CustomerService{
    private final InMemoryCustomerRepository customerRepository;

    public InMemoryCustomerService(InMemoryCustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<String> getSubscriptionsForCustomer(String customerId) {
        return this.customerRepository.getCustomerById(customerId).subscriptions();
    }
}
