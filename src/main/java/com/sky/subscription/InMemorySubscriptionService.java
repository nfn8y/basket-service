package com.sky.subscription;

import com.sky.subscription.models.Subscription;
import com.sky.subscription.repositories.InMemorySubscriptionRepository;

import java.math.BigDecimal;

public class InMemorySubscriptionService implements SubscriptionService {
    private final InMemorySubscriptionRepository subscriptionRepository;

    public InMemorySubscriptionService(InMemorySubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public BigDecimal getSubscriptionPrice(String subscription) {
        Subscription subscriptionFromId = this.subscriptionRepository.getSubscriptionFromId(subscription);
        if (subscriptionFromId == null) {
            throw new SubscriptionNotFoundException();
        }

        return subscriptionFromId.price();
    }
}
