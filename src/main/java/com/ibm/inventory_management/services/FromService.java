package com.ibm.inventory_management.services;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ibm.inventory_management.models.From;
import com.ibm.inventory_management.repositories.FromRepository;
@Service
public class FromService implements FromApi {

    @Autowired
    private FromRepository fromRepository;
    @Override
    public void addFrom(String electricalapliance, String date, String starttime, String endtime) {
        
        From from = new From();
        from.setElectricalapliance(electricalapliance);
        from.setDate(date);
        from.setStarttime(starttime);
        from.setEndtime(endtime);
        try {
            fromRepository.save(from);
      } catch (Exception e) {
            throw new Exception("",e);
      }
}
    
    }

