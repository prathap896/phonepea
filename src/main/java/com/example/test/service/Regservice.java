package com.example.test.service;

import com.example.test.entity.Regentity;
import com.example.test.repository.Regrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//public class Regservice {
//    package com.registrations.service;


    @Service
    public class Regservice {

        @Autowired
        private Regrepository regrepository;
//        private Regrepopsitory regrepopsitory;

        public String storereg(Regentity regentity){
//        Regentity regentity = new Regentity();   // need to create obj to entity to store data

//            regentity.setEmail(regentity.getEmail());
//            regentity.setFirstName(regentity.getFirstName());
//        regentity.setLastName(regentity.getLastName());
//       regentity.setMobile(regentity.getMobile());
//       regentity.setPassword(regentity.getPassword());
            regrepository.save(regentity);
            return "Registered Successfully";
        }

    }


