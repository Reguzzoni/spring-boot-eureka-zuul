package node.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/test")
public class TestController {
	
	@GetMapping(value="/helloWorld")
	public ResponseEntity<String> gethelloWorld(){
		log.info("method gethelloWorld | START");
		return ResponseEntity.ok().body("Hello World");
	}
	
}
