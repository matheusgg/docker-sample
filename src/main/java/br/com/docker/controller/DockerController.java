package br.com.docker.controller;

import br.com.docker.service.DockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(method = GET)
public class DockerController {

	private final DockerService service;

	@Autowired
	public DockerController(final DockerService service) {
		this.service = service;
	}

	@RequestMapping
	public String greetings(final String userName) {
		return this.service.greetings(userName);
	}

}
