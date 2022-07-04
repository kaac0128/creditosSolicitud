package com.creditos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditos.dto.CreditoDto;
import com.creditos.models.SolicitudCredito;
import com.creditos.repository.SolicitudCreditoRepository;

@Service
public class SolicitudCreditoService {
	@Autowired
	private SolicitudCreditoRepository solicitudCreditoRepository;

	public String guardarCredito(CreditoDto creditoDto){
		String response = null;
		try {
			SolicitudCredito solicitudCredito = new SolicitudCredito();
			solicitudCredito.setMonto(creditoDto.getMonto());
			solicitudCredito.setPlazo(creditoDto.getPlazo());
			solicitudCreditoRepository.save(solicitudCredito);
			response = "Hemos recibido tu solicitud de credito te invitamos a continuar diligenciando la informacion adicional";
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return response;
		
	}

	public List<SolicitudCredito> listarCredito(){
		return solicitudCreditoRepository.findAll();
	}

}
