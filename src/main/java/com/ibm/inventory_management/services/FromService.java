package com.ibm.inventory_management.services;

import java.util.List;

import com.ibm.inventory_management.repositories.FromRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.inventory_management.models.From;

@Service
public class FromService implements FromApi {
    
      @Autowired
      private FromRepository fromRepository;
     

      @Override
      public void addFrom(String electricalapliance, String date, String starttime, String endtime) throws Exception {
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
