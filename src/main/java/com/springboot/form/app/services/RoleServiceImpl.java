package com.springboot.form.app.services;

import java.util.ArrayList;
import java.util.List;

import com.springboot.form.app.models.domain.Rol;

public class RoleServiceImpl implements RoleService {

	private List<Rol> roles;
	
	
	
	public RoleServiceImpl() {
		this.roles = new ArrayList<>();
		this.roles.add(new Rol(1, "Administrador", "ROLE_ADMIN"));
		this.roles.add(new Rol(1, "Usuario", "ROLE_USER"));
		this.roles.add(new Rol(1, "Moderador", "ROLE_MODERATOR"));
	}

	@Override
	public List<Rol> listar() {
		
		return roles;
	}

	@Override
	public Rol obtenerPorId(Integer id) {
		Rol resultado = null;
		
		for(Rol role: roles) {
			if(id==role.getId()) {
				resultado = role;
				break;
			}
		}
		return resultado;
	}
	

}
