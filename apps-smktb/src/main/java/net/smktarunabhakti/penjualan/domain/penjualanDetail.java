package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="jual_detail")
public class penjualanDetail implements Serializable{

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid" , strategy="uuid2")
	private String id;
	
	@ManyToOne
	private penjualan jual;
	
	@ManyToOne
	private barang barang;
	
	@Column(name="jumlah_barang")
	private int jumlah;
	
	@Column(name="total_harga")
	private BigDecimal totalHarga;
	
	@ManyToMany(mappedBy="header")
	@Cascade(value = CascadeType.ALL)
	private List<penjualanDetail>listPenjualanDetail;
	
	
}
