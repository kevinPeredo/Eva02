package com.cibertec.cl2.daw.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.cl2.daw.models.Area;
import com.cibertec.cl2.daw.services.AreaService;

@Controller
public class IndexController {
	
	@Autowired
	private AreaService areaService;
	
	@RequestMapping("/")
	public String ver( ) {
		return "index";
	}
	@RequestMapping("/listaTotal")
	public List<Area> lista(){
		
		return areaService.listaAreas();
	}
	
	
	

}
