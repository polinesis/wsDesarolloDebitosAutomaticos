package com.desarrolloDebitosAutomaticos.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.desarrolloDebitosAutomaticos.dto.AdhesionAntRequestDTO;
import com.desarrolloDebitosAutomaticos.dto.AdhesionRequestDTO;

@CrossOrigin({"http://localhost:4200"})
@RestController
public class DesarrollosDebitosAutomaticos {


	 
	@GetMapping("/consultarObjetoc")
	public ResponseEntity<?> pruebaGet() {
		
		ArrayList<String> resultado = new ArrayList<>();
		
		String str1 = new String(" hola 1 ");
		String str2 = new String(" hola 2 ");
		String str3 = new String(" hola 3 ");
		
		resultado.add(str1);
		resultado.add(str2);
		resultado.add(str3);
				
				
		return ResponseEntity.ok(resultado);
	}
	
	@PostMapping("/adhesion")
	public ResponseEntity<?> pruebaPost() {
		
		String str1 = new String(" hola 1 ");
		
		    AdhesionRequestDTO adhesionRequestDTO = new AdhesionRequestDTO("5506","N");
		
		    String token = "";

		    RestTemplate restTemplate = new RestTemplate();

		    String baseUrl = "http://localhost:8080/WSRestPayperTicDebitos/adhesion";

		    URI uri = null;
			try {
				uri = new URI(baseUrl);
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}

		    HttpHeaders headers = new HttpHeaders();
		  //  headers.add("Authorization", "Bearer " + token);
		    headers.add("Content-Type", "application/json");

		    HttpEntity<AdhesionRequestDTO> request = new HttpEntity<>(adhesionRequestDTO, headers);
		    ResponseEntity<?> result = restTemplate.postForEntity(uri, request, ResponseEntity.class);

		 		
		return ResponseEntity.status(HttpStatus.CREATED).body(str1);
				
	}
	
	@PostMapping(value="/adherirPlanAnt/{descripcion}/{email}/{amount}/{nro_plan}",
		    consumes = "application/x-www-form-urlencoded")
	public ResponseEntity<?> adherirPlanAnt(
			@RequestParam("token") String token,
			@RequestParam("installments") String installments,
			@RequestParam("payment_method_id") String paymentMethodId,
			@RequestParam("issuer_id") String issuerId,
			
			@PathVariable("descripcion")  String descripcion, 
    		@PathVariable("email") String email, 
    		@PathVariable("amount") String amount,
            @PathVariable("nro_plan") String paymentPlan) {
		
		/*
		@RequestParam("token") String token,
		@RequestParam("installments") String installments,
		@RequestParam("payment_method_id") String paymentMethodId,
		@RequestParam("issuer_id") String issuerId,
		*/
			ArrayList<String> resultado = new ArrayList<>();
		
			String str1 = new String(" adherirPlanAnt ");
			String str2 = new String(" hola 2 ");
			String str3 = new String(" hola 3 ");
			
			resultado.add(str1);
			resultado.add(str2);
			resultado.add(str3);
			
		    System.out.println(" ********** <+> <+> ********** ");
		    
		    AdhesionAntRequestDTO adhesionAntRequestDTO = new AdhesionAntRequestDTO();
		   
		 /* 
		    RestTemplate restTemplate = new RestTemplate();

		    String baseUrl = "http://localhost:8080/WSRestMercadoPagoDebitos/pagoAnticipo/?/?/?/?";

		    URI uri = null;
			try {
				uri = new URI(baseUrl);
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}

		    HttpHeaders headers = new HttpHeaders();
		  //  headers.add("Authorization", "Bearer " + token);
		    headers.add("Content-Type", "application/json");

		    HttpEntity<AdhesionAntRequestDTO> request = new HttpEntity<>(adhesionAntRequestDTO, headers);
		    ResponseEntity<?> result = restTemplate.postForEntity(uri, request, ResponseEntity.class);
*/
		 		
		return ResponseEntity.status(HttpStatus.CREATED).body(resultado);
				
	}
}

