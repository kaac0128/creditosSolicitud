package com.creditos.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creditos.dto.CreditoDto;
import com.creditos.models.SolicitudCredito;
import com.creditos.services.SolicitudCreditoService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/solicitud")
public class SolicitudCreditoController {

	@Autowired
	private SolicitudCreditoService solicitudCreditoService;

	@PostMapping("/save")
	public String crearCredito(@RequestBody CreditoDto creditoDto){
		String response = null;
		try {
			response = solicitudCreditoService.guardarCredito(creditoDto);
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
		return response;
	}

	@GetMapping("/list")
	public List<SolicitudCredito> listar(){
		return solicitudCreditoService.listarCredito();
	}

}
