package com.creditos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.creditos.models.SolicitudCredito;

@Repository
public interface SolicitudCreditoRepository extends JpaRepository<SolicitudCredito, Integer>{
	
}
