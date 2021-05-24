package com.binance.api.client.domain.account.request;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.Retriable;

public class AllOcoOrderStatusRequest implements Retriable<AllOcoOrderStatusRequest> {

  Long orderListId;

  String origClientOrderId;

  Long recvWindow;

  long timestamp;

  public AllOcoOrderStatusRequest() {
    this.timestamp = System.currentTimeMillis();
    this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
  }

  public Long getOrderListId() {
    return orderListId;
  }

  public void setOrderListId(Long orderListId) {
    this.orderListId = orderListId;
  }

  public String getOrigClientOrderId() {
    return origClientOrderId;
  }

  public void setOrigClientOrderId(String origClientOrderId) {
    this.origClientOrderId = origClientOrderId;
  }

  public Long getRecvWindow() {
    return recvWindow;
  }

  public void setRecvWindow(Long recvWindow) {
    this.recvWindow = recvWindow;
  }

  @Override
  public long getTimestamp() {
    return timestamp;
  }

  @Override
  public AllOcoOrderStatusRequest timestamp(long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  @Override
  public String toString() {
    return "OcoOrderStatusRequest [orderListId=" + orderListId + ", origClientOrderId=" + origClientOrderId + ", recvWindow=" + recvWindow
        + ", timestamp=" + timestamp + "]";
  }

}
