package com.springboot.form.app.models.domain;

public class Rol {
	private Integer id;
	private String nombre;
	private String role;
	
	public Rol() {
		
	}
	
	public Rol(Integer id, String nombre, String role) {
		
		this.id = id;
		this.nombre = nombre;
		this.role = role;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Rol)) {
			return false;
		}
		
		Rol rol = (Rol)obj;
		return this.id !=null && this.id.equals(rol.getId());
	}
	
	

}
