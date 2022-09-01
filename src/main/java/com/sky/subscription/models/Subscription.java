package com.sky.subscription.models;

import java.math.BigDecimal;

public record Subscription (BigDecimal price, String id) {
}
