package com.sky.subscription.repositories;

import com.sky.subscription.models.Subscription;

import java.math.BigDecimal;

public class InMemorySubscriptionRepository {
    public Subscription getSubscriptionFromId(String subscriptionId) {

        return new Subscription(BigDecimal.ONE, "randomSubId");
    }
}
