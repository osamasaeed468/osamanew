package com.jpa.test;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);

//		User user=new User();
//		user.setName("Alimfffjohdddsin");
//		user.setCity("LAgjfjfjghore");
//		user.setStatus("lejffjfjgggg arnig Spring Boot");

//		User user1=userRepository.save(user);

//		System.out.println(user1);
		//create object of user
//		User user1= new User();
//		user1.setName("mohsin");
//		user1.setCity("oubjab");
//		user1.setStatus(
//				"pass status");

//		User user2= new User();
//		user2.setName("mohsin");
//		user2.setCity("Punjab");
//		user2.setStatus("pass status");
// Saving Single user
//		User resultUser = userRepository.save(user2);
	//	List<User> users =List.of(user1,user2);
	//	Iterable<User>result=userRepository.saveAll(users);

	//	result.forEach(user -> {
	//		System.out.println(user);
	//	});


//		System.out.println("Saved user"+resultUser);
	//	System.out.println("Done");


//	Optional<User>optional=userRepository.findById(10);

//	User user=optional.get();

//	user.setCity("Punjab");
//	User result=userRepository.save(user);
//	System.out.println(result);

//			Optional<User>optional=userRepository.findById(11);

//	User user=optional.get();

//	User result=userRepository.save(user);
//	System.out.println(result);


//		deleting the User Element

//        List<User> result=userRepository.findByName("mohsin");
//      result.forEach(user -> System.out.println(result));

        List<User>users=userRepository.getAllUser();
        users.forEach(user -> System.out.println(user));


	}

}
