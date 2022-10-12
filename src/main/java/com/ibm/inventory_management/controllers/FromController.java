package com.ibm.inventory_management.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.ibm.inventory_management.models.From;
import com.ibm.inventory_management.services.FromApi;

@RestController
public class FromController {

  private final FromApi service;

  public FromController(FromApi service) {
    this.service = service;
  }


  @PostMapping(path = "/from_prediction")
  public void addFrom(@RequestParam String electricalapliance, @RequestParam String date, @RequestParam String starttime, @RequestParam String endtime) {
    this.service.addFrom(electricalapliance,date,starttime,endtime);
  }

}
