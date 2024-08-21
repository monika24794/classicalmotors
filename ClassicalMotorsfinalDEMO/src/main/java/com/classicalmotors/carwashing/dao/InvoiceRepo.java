package com.classicalmotors.carwashing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classicalmotors.carwashing.entity.Invoice;


public interface InvoiceRepo  extends JpaRepository<Invoice, Integer> {
 Invoice findBynumber(String number);
}
