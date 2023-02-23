package com.example.calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControladorOperando {
 
		@Autowired
		ServicioCliente servicio = new ServicioCliente();
	
	@GetMapping(path = "/operaciones/suma")
	public ResponseEntity<Integer> suma(@RequestParam Integer ope1, @RequestParam Integer ope2) {

		return ResponseEntity.ok(servicio.getCliente().add(ope1, ope2));

	}
	@GetMapping(path = "/operaciones/resta")
	public ResponseEntity<Integer> resta(@RequestParam Integer ope1, @RequestParam Integer ope2) {
		return ResponseEntity.ok(servicio.getCliente().subtract(ope1, ope2));
	}

	@GetMapping(path = "/operaciones/multiplica")
	public ResponseEntity<Integer> multiplicacion(@RequestParam Integer ope1, @RequestParam Integer ope2) {
		return ResponseEntity.ok(servicio.getCliente().multiply(ope1, ope2));
	}

	@GetMapping(path = "/operaciones/divide")
	public ResponseEntity<Integer> division(@RequestParam Integer ope1, @RequestParam Integer ope2) {
		return ResponseEntity.ok(servicio.getCliente().divide(ope1, ope2));
	}

	@GetMapping(path = "/actuator/info")
	public ResponseEntity<String> pingo(){
		return ResponseEntity.ok("todo bien jose luis");
	}


}
