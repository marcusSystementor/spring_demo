package com.springTest.demo.dao;

import com.springTest.demo.model.HomeAddress;
import com.springTest.demo.repository.HomeAddressRepository;
import org.springframework.stereotype.Repository;

@Repository
public class HomeAddressDAO {

    HomeAddressRepository homeAddressRepository;

    public HomeAddressDAO(HomeAddressRepository homeAddressRepository) {
        this.homeAddressRepository = homeAddressRepository;
    }

    public HomeAddress addHomeAddress (HomeAddress homeAddress) {
        return homeAddressRepository.save(homeAddress);
    }

}
