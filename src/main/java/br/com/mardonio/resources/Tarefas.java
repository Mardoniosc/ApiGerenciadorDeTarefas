package br.com.mardonio.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefas")
public class Tarefas {
	
	@GetMapping
	public String funcionando() {
		return "Tarefas";
	}
}
