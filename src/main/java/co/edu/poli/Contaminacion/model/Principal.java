package co.edu.poli.Contaminacion.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Contaminacion")
public class Principal {
 
	@Id
	private ObjectId _id;
	private Department departamento;
	private Measurement medicion; 
	
	public Principal(){
		
	}

	public Principal( Department departamento, Measurement medicion) {
		super();
		this.departamento = departamento;
		this.medicion = medicion;
	}

	public Department getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Department departamento) {
		this.departamento = departamento;
	}

	public Measurement getMedicion() {
		return medicion;
	}

	public void setMedicion(Measurement medicion) {
		this.medicion = medicion;
	}
	
	
}
