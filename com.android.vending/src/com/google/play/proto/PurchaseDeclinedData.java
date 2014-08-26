// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Purchase.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.INT32;

public final class PurchaseDeclinedData extends Message {

  public static final Integer DEFAULT_REASON = 0;
  public static final Boolean DEFAULT_SHOWNOTIFICATION = false;

  @ProtoField(tag = 1, type = INT32)
  public final Integer reason;

  @ProtoField(tag = 2, type = BOOL)
  public final Boolean showNotification;

  public PurchaseDeclinedData(Integer reason, Boolean showNotification) {
    this.reason = reason;
    this.showNotification = showNotification;
  }

  private PurchaseDeclinedData(Builder builder) {
    this(builder.reason, builder.showNotification);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PurchaseDeclinedData)) return false;
    PurchaseDeclinedData o = (PurchaseDeclinedData) other;
    return equals(reason, o.reason)
        && equals(showNotification, o.showNotification);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = reason != null ? reason.hashCode() : 0;
      result = result * 37 + (showNotification != null ? showNotification.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<PurchaseDeclinedData> {

    public Integer reason;
    public Boolean showNotification;

    public Builder() {
    }

    public Builder(PurchaseDeclinedData message) {
      super(message);
      if (message == null) return;
      this.reason = message.reason;
      this.showNotification = message.showNotification;
    }

    public Builder reason(Integer reason) {
      this.reason = reason;
      return this;
    }

    public Builder showNotification(Boolean showNotification) {
      this.showNotification = showNotification;
      return this;
    }

    @Override
    public PurchaseDeclinedData build() {
      return new PurchaseDeclinedData(this);
    }
  }
}