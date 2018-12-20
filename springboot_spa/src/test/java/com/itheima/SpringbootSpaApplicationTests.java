package com.itheima;

import com.itheima.domain.User;
import com.itheima.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootSpaApplication.class)
public class SpringbootSpaApplicationTests {
	@Autowired
	private UserRepository repository;
	@Test
	public void contextLoads() {
		List<User> users = repository.findAll();
		System.out.println(users);
	}

}

