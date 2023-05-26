package com.cibertec.cl2.daw.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cibertec.cl2.daw.models.Personal;


public interface IPersonalRepository extends JpaRepository<Personal, Long>{
  @Query("Select x from Personal x where x.area.codigo_area = :param")
	
	public abstract List<Personal> listarPorArea(@Param(value = "param")int codigo_area);
}
