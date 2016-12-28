package org.shop.products.visitor;

import org.shop.products.Haribo;
import org.shop.products.Mars;
import org.shop.products.interfaces.IPromotions;

import java.math.BigDecimal;

/**
 * Created by Robert Szczygielski on 28.12.16.
 */
public class Promotions implements IPromotions {
    private BigDecimal toPromotionMars = new BigDecimal(3);
    private BigDecimal toPromotionHaribo = new BigDecimal(4);

    @Override
    public BigDecimal check(Mars mars) {
        if(mars.getAmount().compareTo(toPromotionMars) == 0) {
            BigDecimal result = mars.getAmount().multiply(mars.getPrice());
            return result.subtract(new BigDecimal("0.25"));
        }
        return mars.getAmount().multiply(mars.getPrice());
    }

    @Override
    public BigDecimal check(Haribo haribo) {
        if(haribo.getAmount().compareTo(toPromotionHaribo) == 0) {
            BigDecimal result = haribo.getAmount().multiply(haribo.getPrice());
            return result.subtract(BigDecimal.ONE);
        }
        return haribo.getAmount().multiply(haribo.getPrice());
    }
}
