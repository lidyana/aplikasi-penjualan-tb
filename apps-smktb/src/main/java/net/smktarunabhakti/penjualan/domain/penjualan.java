package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.GenericGenerator;

//munculin setter dan getter pada eclipse = alt-shift-s-r

@Entity
@Table(name="jual_beli")
public class penjualan implements Serializable{
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid" , strategy="uuid2")
	private String id;
	
	@Column(name="waktu_transaksi")
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date tgl;
	
	@Column(nullable = false)
	private String kasir;
	
	@Column(name="no_struk" , nullable = false)
	private String noStruk;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Date getTgl() {
		return tgl;
	}
	
	public void setTgl(Date tgl) {
		this.tgl = tgl;
	}
	
	public String getKasir() {
		return kasir;
	}
	public void setKasir(String kasir) {
		this.kasir = kasir;
	}
	
	public String getNoStruk() {
		return noStruk;
	}
	
	public void setNoStruk(String noStruk) {
		this.noStruk = noStruk;
	}
	
	
}
