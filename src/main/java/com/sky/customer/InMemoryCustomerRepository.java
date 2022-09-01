package com.sky.customer;

import com.sky.customer.models.Customer;

import java.util.ArrayList;
import java.util.Arrays;

public class InMemoryCustomerRepository {
    public Customer getCustomerById(String customerId) {
        return new Customer("randomCustomerId",
                "Sonam Bhatt",
                Arrays.asList("subscription1", "subscription2"));
    }
}
