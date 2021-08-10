package br.ufg.inf.fs.ctrl;

import java.util.ArrayList;
import java.util.List;

import br.ufg.inf.fs.business.HospedeBusiness;
import br.ufg.inf.fs.entities.Hospede;
import br.ufg.inf.fs.exceptions.HospedeException;

public class HospedeCtrl {

	HospedeBusiness business = new HospedeBusiness();
	
	public List<Hospede> findAll(){
		List<Hospede> retorno = new ArrayList<Hospede>();
		
		try {
			retorno = business.findAll();
		} catch (HospedeException e) {
			System.err.println(e.getMessage());
		}
		
		return retorno;
	}
	
	public Hospede findById(Integer id) {
		Hospede retorno = new Hospede();
		
		try {
			retorno = business.findById(id);
		} catch (HospedeException e) {
			System.err.println(e.getMessage());
		}
		
		return retorno;
	}
	
	public Hospede insert(Hospede hotel) {
		try {
			hotel = business.insert(hotel);
		} catch (HospedeException e) {
			System.err.println(e.getMessage());
		}
		return hotel;
	}
	
	public Hospede update(Hospede hotel) {
		try {
			hotel = business.update(hotel);
		} catch (HospedeException e) {
			System.err.println(e.getMessage());
		}
		return hotel;
	}
	
	public void delete(Integer id) {
		try {
			business.delete(id);
		} catch (HospedeException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
}
