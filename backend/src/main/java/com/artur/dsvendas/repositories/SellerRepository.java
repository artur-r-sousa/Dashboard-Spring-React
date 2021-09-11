package com.artur.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artur.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
