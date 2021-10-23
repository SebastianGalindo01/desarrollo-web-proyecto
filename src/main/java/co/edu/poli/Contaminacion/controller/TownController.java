package co.edu.poli.Contaminacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.Contaminacion.model.Principal;
import co.edu.poli.Contaminacion.repository.TownRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Api(tags = {"Class: TownController"}) //tag defined in SwaggerConfig.java
@RestController // Defines that this class is a spring bean
@RequestMapping("/api/v1/")
public class TownController {

	@Autowired
	private TownRepository townRepository;

	@GetMapping("/Municipio")
	@ApiOperation(value = "*** Service Method Get All Principal ***", notes = "*** Get All Principal from MongoDB\\\\WebApp ***")
	@ApiResponses(value = {@ApiResponse(code = 404, message = "*** Error Get All Principal!!! ***")})
	public List<Principal> getAllPrincipal() {
		return townRepository.findAll();
	}

	@GetMapping("/Municipio/{id}")
	public Principal getPrincipalByID(@PathVariable String id) {
		return townRepository.findById(id).get();
	}

	@PostMapping("/Municipio")
	public Principal saveTown(@RequestBody Principal town) {
		return townRepository.save(town);
	}

	@PostMapping("/MunicipioList")
	public List<Principal> saveListTown(@RequestBody List<Principal> towns) {
		return townRepository.saveAll(towns);
	}

	@PutMapping("/Municipio/{id}")
	public Principal updateMunicipios(@PathVariable String id, @RequestBody Principal principal) {

		Principal _Princ = townRepository.findById(id).get();

		_Princ.setDepartamento(principal.getDepartamento());
		_Princ.setMedicion(principal.getMedicion());

		townRepository.save(_Princ);

		return _Princ;
	}

	@DeleteMapping("/Municipio/{id}")
	public Principal deleteprincipalById(@PathVariable String id) {
		Principal _Princ = townRepository.findById(id).get();
		townRepository.deleteById(id);
		return _Princ;
	}
	
	
	@DeleteMapping("/MunicipioList")
	public void deleteAll() {
		townRepository.deleteAll();
	}
	

}
