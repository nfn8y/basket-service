package com.sky.basket;

import com.sky.subscription.SubscriptionService;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BasketServiceTest {
    private SubscriptionService mockedSubscriptionService = Mockito.mock(SubscriptionService.class);
    private BasketService service = new BasketService(mockedSubscriptionService);

    @Test
    public void shouldReturnSumOfPriceOfAllSubscriptions() {
        List<String> subscriptions = List.of("id");
        Mockito.when(mockedSubscriptionService.getSubscriptionPrice("id")).thenReturn(BigDecimal.ONE);

        BigDecimal calculate = this.service.calculate(subscriptions);

        assertEquals(BigDecimal.ONE, calculate);
    }
}