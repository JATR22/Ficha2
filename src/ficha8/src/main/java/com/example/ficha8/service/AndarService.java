package com.example.ficha8.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ficha8.model.Andar;
import com.example.ficha8.model.CentroComercial;
import com.example.ficha8.model.Loja;
import com.example.ficha8.repository.AndarRepository;
import com.example.ficha8.repository.CentroComercialRepository;
import com.example.ficha8.repository.LojaRepository;

import static java.lang.Float.NaN;
import static java.lang.Long.parseLong;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AndarService {
	
	private final AndarRepository andarRepo;
	private final CentroComercialRepository ccRepo;
	private final LojaRepository lojaRepo;
	
	@Autowired
	public AndarService(AndarRepository andarRepo, CentroComercialRepository ccRepo, LojaRepository lojaRepo) {
		this.andarRepo = andarRepo;
		this.ccRepo = ccRepo;
		this.lojaRepo = lojaRepo;
	}
	
	public boolean addAndar(Andar andar) {
		if(andar.getId() == null) {
			andarRepo.save(andar);
			return true;
		}
		return false;
	}

	public String addAndarToCentroComercial(String andar_id, String centro_comercial_id) {
		Optional<Andar> opcionalAndar = andarRepo.findById(Long.parseLong(andar_id));
		Optional<CentroComercial> opcionalCC = ccRepo.findById(Long.parseLong(centro_comercial_id));
		
		if(opcionalAndar.isPresent() && opcionalCC.isPresent()) {
			Andar andarAux = opcionalAndar.get();
			CentroComercial ccAux = opcionalCC.get();
			
			ccAux.addAndar(ccAux, andarAux);
			andarAux.setCentro_comercial(ccAux);
			
			ccRepo.save(ccAux);
			andarRepo.save(andarAux);
			
			return "Um andar foi acrescentado ao centro comercial.";
		}
		return "Foi encontrado um erro ao acrescentar o andar ao centro comercial.";
	}
	
	public boolean deleteAndar(String id) {
		try {
			Long idLong = parseLong(id);
			
			if(id == null || idLong==NaN || andarRepo.findById(idLong).isEmpty()) {
				return false;
			}
			
			Andar andar = andarRepo.findById(idLong).get();
			for(Loja aux: andar.getLojas()) {
				lojaRepo.delete(aux);
			}
			andarRepo.delete(andar);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<Andar> getAllAndar(){
		List<Andar> listaAndar = new ArrayList<>();
		
		andarRepo.findAll().forEach(listaAndar::add);
		
		return listaAndar;
	}
	

}
