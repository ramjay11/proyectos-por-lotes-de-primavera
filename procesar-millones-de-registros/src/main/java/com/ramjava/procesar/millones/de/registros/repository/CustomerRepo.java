package com.ramjava.procesar.millones.de.registros.repository;

import com.ramjava.procesar.millones.de.registros.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
