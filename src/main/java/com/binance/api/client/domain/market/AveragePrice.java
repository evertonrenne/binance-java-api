package com.binance.api.client.domain.market;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Wraps a symbol and its corresponding latest price.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AveragePrice {

  /**
   * Latest price.
   */
  private String price;
  /**
    minutes
   */
  private String mins;

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getMins() {
    return mins;
  }

  public void setMins(String mins) {
    this.mins = mins;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("price", price)
        .append("mins", mins)
        .toString();
  }


}
