package com.cibertec.cl2.daw.services;

import java.util.List;

import com.cibertec.cl2.daw.models.Personal;

public interface PersonalService {

	public abstract List<Personal> listarPorArea(int codigo_area);
	public abstract List<Personal> listaTodos();
}
