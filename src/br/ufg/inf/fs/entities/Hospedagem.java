package br.ufg.inf.fs.entities;

import java.sql.Date;

public class Hospedagem {

	private Integer idHospedagem;
	private Quarto idQuarto;
	private Hospede idHospede;
	private Date dtCheckin;
	private Date dtCheckout;
	
	public Hospedagem() {
	}
	
	public Hospedagem(Integer idHospedagem, Quarto idQuarto, Hospede idHospede, Date dtCheckin, Date dtCheckout) {
		super();
		this.idHospedagem = idHospedagem;
		this.idQuarto = idQuarto;
		this.idHospede = idHospede;
		this.dtCheckin = dtCheckin;
		this.dtCheckout = dtCheckout;
	}

	public Integer getIdHospedagem() {
		return idHospedagem;
	}

	public void setIdHospedagem(Integer idHospedagem) {
		this.idHospedagem = idHospedagem;
	}

	public Quarto getIdQuarto() {
		return idQuarto;
	}

	public void setIdQuarto(Quarto idQuarto) {
		this.idQuarto = idQuarto;
	}

	public Hospede getIdHospede() {
		return idHospede;
	}

	public void setIdHospede(Hospede idHospede) {
		this.idHospede = idHospede;
	}

	public Date getDtCheckin() {
		return dtCheckin;
	}

	public void setDtCheckin(Date dtCheckin) {
		this.dtCheckin = dtCheckin;
	}

	public Date getDtCheckout() {
		return dtCheckout;
	}

	public void setDtCheckout(Date dtCheckout) {
		this.dtCheckout = dtCheckout;
	}

	@Override
	public String toString() {
		return "Hospedagem [idHospedagem=" + idHospedagem + ", idQuarto=" + idQuarto.getIdQuarto() + ", idHospede=" + idHospede.getIdHospede()
				+ ", dtCheckin=" + dtCheckin + ", dtCheckout=" + dtCheckout + "]";
	}
}
