package br.ufg.inf.fs.business;

import java.util.List;

import br.ufg.inf.fs.dao.DB;
import br.ufg.inf.fs.dao.HospedagemDao;
import br.ufg.inf.fs.entities.Hospedagem;
import br.ufg.inf.fs.exceptions.HospedagemException;

public class HospedagemBusiness {

	
	HospedagemDao dao = new HospedagemDao(DB.getConnection());
	
	public List<Hospedagem> findAll() throws HospedagemException{
		return dao.findAll();
	}
	
	public Hospedagem findById(Integer id) throws HospedagemException{
		return dao.findById(id);
	}
	
	public Hospedagem insert(Hospedagem hospede) throws HospedagemException {
		return dao.insert(hospede);
	}
	
	public Hospedagem update(Hospedagem hospede) throws HospedagemException {
		return dao.update(hospede);
	}
	
	public void delete(Integer id) throws HospedagemException {
		dao.delete(id);
	}
}
