package org.shop.products.interfaces;

import org.shop.products.Haribo;
import org.shop.products.Mars;

import java.math.BigDecimal;

/**
 * Created by Robert Szczygielski on 28.12.16.
 */
public interface IPromotions {
    BigDecimal check(Mars mars);
    BigDecimal check(Haribo haribo);
}
