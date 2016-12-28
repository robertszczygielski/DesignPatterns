package org.shop.products;

import org.shop.products.interfaces.IPromotions;
import org.shop.products.interfaces.Sweets;
import org.shop.products.visitor.Promotions;

import java.math.BigDecimal;

/**
 * Created by Robert Szczygielski on 28.12.16.
 */
public class Haribo implements Sweets {
    private IPromotions promotions;
    private BigDecimal amount;
    private final BigDecimal price = new BigDecimal(1.5);

    public Haribo(int amount) {
        this.amount = new BigDecimal(amount);
        promotions = new Promotions();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public BigDecimal getCost() {
        return promotions.check(this);
    }
}
