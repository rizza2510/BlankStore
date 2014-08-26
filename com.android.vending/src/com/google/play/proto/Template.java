// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Documents.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Template extends Message {

  @ProtoField(tag = 1)
  public final SeriesAntenna seriesAntenna;

  @ProtoField(tag = 2)
  public final TileTemplate tileGraphic2X1;

  @ProtoField(tag = 3)
  public final TileTemplate tileGraphic4X2;

  @ProtoField(tag = 4)
  public final TileTemplate tileGraphicColoredTitle2X1;

  @ProtoField(tag = 5)
  public final TileTemplate tileGraphicUpperLeftTitle2X1;

  @ProtoField(tag = 6)
  public final TileTemplate tileDetailsReflectedGraphic2X2;

  @ProtoField(tag = 7)
  public final TileTemplate tileFourBlock4X2;

  @ProtoField(tag = 8)
  public final ContainerWithBanner containerWithBanner;

  @ProtoField(tag = 9)
  public final DealOfTheDay dealOfTheDay;

  @ProtoField(tag = 10)
  public final TileTemplate tileGraphicColoredTitle4X2;

  @ProtoField(tag = 11)
  public final EditorialSeriesContainer editorialSeriesContainer;

  public Template(SeriesAntenna seriesAntenna, TileTemplate tileGraphic2X1, TileTemplate tileGraphic4X2, TileTemplate tileGraphicColoredTitle2X1, TileTemplate tileGraphicUpperLeftTitle2X1, TileTemplate tileDetailsReflectedGraphic2X2, TileTemplate tileFourBlock4X2, ContainerWithBanner containerWithBanner, DealOfTheDay dealOfTheDay, TileTemplate tileGraphicColoredTitle4X2, EditorialSeriesContainer editorialSeriesContainer) {
    this.seriesAntenna = seriesAntenna;
    this.tileGraphic2X1 = tileGraphic2X1;
    this.tileGraphic4X2 = tileGraphic4X2;
    this.tileGraphicColoredTitle2X1 = tileGraphicColoredTitle2X1;
    this.tileGraphicUpperLeftTitle2X1 = tileGraphicUpperLeftTitle2X1;
    this.tileDetailsReflectedGraphic2X2 = tileDetailsReflectedGraphic2X2;
    this.tileFourBlock4X2 = tileFourBlock4X2;
    this.containerWithBanner = containerWithBanner;
    this.dealOfTheDay = dealOfTheDay;
    this.tileGraphicColoredTitle4X2 = tileGraphicColoredTitle4X2;
    this.editorialSeriesContainer = editorialSeriesContainer;
  }

  private Template(Builder builder) {
    this(builder.seriesAntenna, builder.tileGraphic2X1, builder.tileGraphic4X2, builder.tileGraphicColoredTitle2X1, builder.tileGraphicUpperLeftTitle2X1, builder.tileDetailsReflectedGraphic2X2, builder.tileFourBlock4X2, builder.containerWithBanner, builder.dealOfTheDay, builder.tileGraphicColoredTitle4X2, builder.editorialSeriesContainer);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Template)) return false;
    Template o = (Template) other;
    return equals(seriesAntenna, o.seriesAntenna)
        && equals(tileGraphic2X1, o.tileGraphic2X1)
        && equals(tileGraphic4X2, o.tileGraphic4X2)
        && equals(tileGraphicColoredTitle2X1, o.tileGraphicColoredTitle2X1)
        && equals(tileGraphicUpperLeftTitle2X1, o.tileGraphicUpperLeftTitle2X1)
        && equals(tileDetailsReflectedGraphic2X2, o.tileDetailsReflectedGraphic2X2)
        && equals(tileFourBlock4X2, o.tileFourBlock4X2)
        && equals(containerWithBanner, o.containerWithBanner)
        && equals(dealOfTheDay, o.dealOfTheDay)
        && equals(tileGraphicColoredTitle4X2, o.tileGraphicColoredTitle4X2)
        && equals(editorialSeriesContainer, o.editorialSeriesContainer);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = seriesAntenna != null ? seriesAntenna.hashCode() : 0;
      result = result * 37 + (tileGraphic2X1 != null ? tileGraphic2X1.hashCode() : 0);
      result = result * 37 + (tileGraphic4X2 != null ? tileGraphic4X2.hashCode() : 0);
      result = result * 37 + (tileGraphicColoredTitle2X1 != null ? tileGraphicColoredTitle2X1.hashCode() : 0);
      result = result * 37 + (tileGraphicUpperLeftTitle2X1 != null ? tileGraphicUpperLeftTitle2X1.hashCode() : 0);
      result = result * 37 + (tileDetailsReflectedGraphic2X2 != null ? tileDetailsReflectedGraphic2X2.hashCode() : 0);
      result = result * 37 + (tileFourBlock4X2 != null ? tileFourBlock4X2.hashCode() : 0);
      result = result * 37 + (containerWithBanner != null ? containerWithBanner.hashCode() : 0);
      result = result * 37 + (dealOfTheDay != null ? dealOfTheDay.hashCode() : 0);
      result = result * 37 + (tileGraphicColoredTitle4X2 != null ? tileGraphicColoredTitle4X2.hashCode() : 0);
      result = result * 37 + (editorialSeriesContainer != null ? editorialSeriesContainer.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Template> {

    public SeriesAntenna seriesAntenna;
    public TileTemplate tileGraphic2X1;
    public TileTemplate tileGraphic4X2;
    public TileTemplate tileGraphicColoredTitle2X1;
    public TileTemplate tileGraphicUpperLeftTitle2X1;
    public TileTemplate tileDetailsReflectedGraphic2X2;
    public TileTemplate tileFourBlock4X2;
    public ContainerWithBanner containerWithBanner;
    public DealOfTheDay dealOfTheDay;
    public TileTemplate tileGraphicColoredTitle4X2;
    public EditorialSeriesContainer editorialSeriesContainer;

    public Builder() {
    }

    public Builder(Template message) {
      super(message);
      if (message == null) return;
      this.seriesAntenna = message.seriesAntenna;
      this.tileGraphic2X1 = message.tileGraphic2X1;
      this.tileGraphic4X2 = message.tileGraphic4X2;
      this.tileGraphicColoredTitle2X1 = message.tileGraphicColoredTitle2X1;
      this.tileGraphicUpperLeftTitle2X1 = message.tileGraphicUpperLeftTitle2X1;
      this.tileDetailsReflectedGraphic2X2 = message.tileDetailsReflectedGraphic2X2;
      this.tileFourBlock4X2 = message.tileFourBlock4X2;
      this.containerWithBanner = message.containerWithBanner;
      this.dealOfTheDay = message.dealOfTheDay;
      this.tileGraphicColoredTitle4X2 = message.tileGraphicColoredTitle4X2;
      this.editorialSeriesContainer = message.editorialSeriesContainer;
    }

    public Builder seriesAntenna(SeriesAntenna seriesAntenna) {
      this.seriesAntenna = seriesAntenna;
      return this;
    }

    public Builder tileGraphic2X1(TileTemplate tileGraphic2X1) {
      this.tileGraphic2X1 = tileGraphic2X1;
      return this;
    }

    public Builder tileGraphic4X2(TileTemplate tileGraphic4X2) {
      this.tileGraphic4X2 = tileGraphic4X2;
      return this;
    }

    public Builder tileGraphicColoredTitle2X1(TileTemplate tileGraphicColoredTitle2X1) {
      this.tileGraphicColoredTitle2X1 = tileGraphicColoredTitle2X1;
      return this;
    }

    public Builder tileGraphicUpperLeftTitle2X1(TileTemplate tileGraphicUpperLeftTitle2X1) {
      this.tileGraphicUpperLeftTitle2X1 = tileGraphicUpperLeftTitle2X1;
      return this;
    }

    public Builder tileDetailsReflectedGraphic2X2(TileTemplate tileDetailsReflectedGraphic2X2) {
      this.tileDetailsReflectedGraphic2X2 = tileDetailsReflectedGraphic2X2;
      return this;
    }

    public Builder tileFourBlock4X2(TileTemplate tileFourBlock4X2) {
      this.tileFourBlock4X2 = tileFourBlock4X2;
      return this;
    }

    public Builder containerWithBanner(ContainerWithBanner containerWithBanner) {
      this.containerWithBanner = containerWithBanner;
      return this;
    }

    public Builder dealOfTheDay(DealOfTheDay dealOfTheDay) {
      this.dealOfTheDay = dealOfTheDay;
      return this;
    }

    public Builder tileGraphicColoredTitle4X2(TileTemplate tileGraphicColoredTitle4X2) {
      this.tileGraphicColoredTitle4X2 = tileGraphicColoredTitle4X2;
      return this;
    }

    public Builder editorialSeriesContainer(EditorialSeriesContainer editorialSeriesContainer) {
      this.editorialSeriesContainer = editorialSeriesContainer;
      return this;
    }

    @Override
    public Template build() {
      return new Template(this);
    }
  }
}