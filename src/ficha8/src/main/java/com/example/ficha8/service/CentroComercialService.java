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
public class CentroComercialService {

	private final CentroComercialRepository ccRepo;
	private final AndarRepository andarRepo;
	private final LojaRepository lojaRepo;
	
	@Autowired
	public CentroComercialService(CentroComercialRepository ccRepo, AndarRepository andarRepo, LojaRepository lojaRepo) {
		super();
		this.ccRepo = ccRepo;
		this.andarRepo = andarRepo;
		this.lojaRepo = lojaRepo;
	}
	
	public boolean addCentroComercial(CentroComercial cc) {
		if(cc.getId() == null) {
			ccRepo.save(cc);
			return true;
		}
		return false;
	}

	public boolean deleteCentroComercial(String id) {
		try {
			Long idLong = parseLong(id);
			
			if(id == null || idLong==NaN || ccRepo.findById(idLong).isEmpty()) {
				return false;
			}
			
			CentroComercial cc = ccRepo.findById(idLong).get();
			for(Andar aux: cc.getAndares()) {
				for(Loja aux2: aux.getLojas()) {
					lojaRepo.delete(aux2);
				}
				andarRepo.delete(aux);
			}
			ccRepo.delete(cc);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<CentroComercial> getAllCentroComercial(){
		List<CentroComercial> listaCC = new ArrayList<>();
		
		ccRepo.findAll().forEach(listaCC::add);
		
		return listaCC;
	}
	
	public Optional<CentroComercial> getCentroComercialById(Long id) {
		return ccRepo.findById(id);
	}
	
}

