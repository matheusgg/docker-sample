package br.com.docker.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DockerService {

	@Cacheable(cacheNames = "docker-service:greetings", key = "#root.method.getName().concat('-').concat(#userName)", unless = "#result.isEmpty()")
	public String greetings(final String userName) {
		return "Welcome " + userName;
	}

}
