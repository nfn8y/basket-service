package com.sky.basket;

import com.sky.subscription.SubscriptionService;
import com.sky.subscription.models.Subscription;

import java.math.BigDecimal;
import java.util.List;

public class BasketService {
    private final SubscriptionService subscriptionService;

    public BasketService(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    public BigDecimal calculate(List<String> subscriptions) throws BasketConditionNotMetException {
        return subscriptions.stream()
                .map(this.subscriptionService::getSubscriptionPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
