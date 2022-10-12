package com.ibm.inventory_management.models;

import java.io.Serializable;

public class From implements Serializable {
  private String electricalapliance= "";
  private String id = null;
  private String date = "";
  private String starttime= "";
  private String endtime = "";

  public From() {
    super();
  }

  public From(String id) {
    this.id = id;
  }

  public String getElectricalapliance() {
    return electricalapliance;
  }

  public void setElectricalapliance(String electricalapliance) {
    this.electricalapliance = electricalapliance;
  }

  public From withElectricalapliance(String electricalapliance) {
    this.setElectricalapliance(electricalapliance);
    return this;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public From withId(String id) {
    this.setId(id);
    return this;
  }


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public From withDate(String date) {
    this.setDate(date);
    return this;
  }

  public String getStarttime() {
    return starttime;
  }

  public void setStarttime(String starttime) {
    this.starttime = starttime;
  }

  public From withStarttime(String starttime) {
    this.setStarttime(starttime);
    return this;
  }

  public String getEndtime() {
    return endtime;
  }

  public void setEndtime(String endtime) {
    this.endtime = endtime;
  }

  public From withEndtime(String endtime) {
    this.setEndtime(endtime);
    return this;
  }
}
