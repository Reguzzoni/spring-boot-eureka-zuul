package node.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import node.model.RuoloDto;
import node.service.RuoloService;

@RestController
@Slf4j
@RequestMapping("/ruoli")
public class RuoloController {

	@Autowired
	RuoloService ruoloService;
	
	@GetMapping(value="/helloWorld")
	public ResponseEntity<String> gethelloWorld(){

		return ResponseEntity.ok().body("Hello World");
	}
	
	/**
	 * Get list of roles
	 * @return list of Ruoli existing on DB
	 */
	@GetMapping("/getListRuoli")
	public ResponseEntity<List<RuoloDto>> getListRuoli() {
		log.info("getListRuoli - START");
		List<RuoloDto> response = ruoloService.getAllRuoli();
		log.info("getListRuoli - response of count : {}", response.size());
		
		return Optional
				.ofNullable(response)
				.map( list -> ResponseEntity.ok().body(list))  
				.orElseGet( () -> ResponseEntity.notFound().build() );
	}
}
