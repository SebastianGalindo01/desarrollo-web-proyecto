package co.edu.poli.Contaminacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.Contaminacion.model.User;
import co.edu.poli.Contaminacion.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "http://localhost:4200")
@Api(tags = {"Class: TownController"}) //tag defined in SwaggerConfig.java
@RestController // Defines that this class is a spring bean
@RequestMapping("/api/v1/")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/user")
	@ApiOperation(value = "*** Service Method Get All Principal ***", notes = "*** Get All Principal from MongoDB\\\\WebApp ***")
	@ApiResponses(value = {@ApiResponse(code = 404, message = "*** Error Get All Principal!!! ***")})
	public List<User> getAllPrincipal() {
		return userRepository.findAll();
	}
	

	@PostMapping("/user")
	public User saveTown(@RequestBody User user) {
		return userRepository.save(user);
	}

	
	@PostMapping("/userList")
	public List<User> saveListUser(@RequestBody List<User> user) {
		return userRepository.saveAll(user);
	}
	
	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User user) {

		User _user = userRepository.findById(id).get();

		_user.setUserName(user.getUserName());
		_user.setRoles(user.getRoles());

		userRepository.save(_user);

		return _user;
	}
	
	@DeleteMapping("/user/{id}")
	public User deleteUserlById(@PathVariable int id) {
		User _user = userRepository.findById(id).get();
		userRepository.deleteById(id);
		return _user;
	}
}
