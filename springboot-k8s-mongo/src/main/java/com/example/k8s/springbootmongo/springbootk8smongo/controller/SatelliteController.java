package com.example.k8s.springbootmongo.springbootk8smongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.k8s.springbootmongo.springbootk8smongo.entity.Satellite;
import com.example.k8s.springbootmongo.springbootk8smongo.repository.SatelliteRepository;

@RestController
public class SatelliteController {
	
	@Autowired
	private SatelliteRepository satelliteRepository;
	
	@PostMapping("/addConstellation")
	public String saveSatellite(@RequestBody Satellite satellite) {
		satelliteRepository.save(satellite);
		return "Constellation added successfully::"+satellite.getId();
		
	}
	
	@GetMapping("/findAllConstellations")
	public List<Satellite> getSatellites() {
		return satelliteRepository.findAll();
	}

	@GetMapping("/findConstellations/{id}")
	public Optional<Satellite> getSatellite(@PathVariable Long id) {
		return satelliteRepository.findById(id);
	}
	
	@GetMapping("/deleteConstellations/{id}")
	public String deleteSatellite(@PathVariable Long id) {
		satelliteRepository.deleteById(id);
		return "Deleted Constellation Successfully::"+id;
	}
	
	@PostMapping("/update/{id}")
	public String updateSatellite(@PathVariable Long id, Satellite satellite,
	  BindingResult result, Model model) {	
		if (result.hasErrors()) {
			satellite.setId(id);
	        return "update-Constellation";
	    }
		satelliteRepository.save(satellite);
	    return "redirect";
	}
	
}
