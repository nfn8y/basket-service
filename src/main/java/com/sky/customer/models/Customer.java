package com.sky.customer.models;

import java.util.List;

public record Customer (String customerId, String name, List<String> subscriptions) {

}
