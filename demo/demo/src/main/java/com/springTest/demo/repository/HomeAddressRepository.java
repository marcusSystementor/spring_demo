package com.springTest.demo.repository;

import com.springTest.demo.model.HomeAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeAddressRepository extends JpaRepository<HomeAddress, Integer> {
}
