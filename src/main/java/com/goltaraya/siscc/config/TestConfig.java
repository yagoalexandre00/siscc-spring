package com.goltaraya.siscc.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.goltaraya.siscc.entities.User;
import com.goltaraya.siscc.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Yago", "Affonso", "67916235781", "98983899021", "yago@mail.com");
		User u2 = new User(null, "Luiz", "Fellipe", "39683227384", "98983899022", "fellipe@mail.com");
		User u3 = new User(null, "Ciro", "Dourado", "80116634375", "98983899023", "ciro@mail.com");
		User u4 = new User(null, "Thiago", "González", "25441364300", "98983899024", "thiago@mail.com");
		User u5 = new User(null, "Cayo", "Cutrim", "35853881329", "98983899025", "cayo@mail.com");

		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));
	}

}
