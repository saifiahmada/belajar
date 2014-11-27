package com.saifiahmada.zhs.belajar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** @author Saifi Ahmada Nov 27, 2014 12:11:45 PM  **/
@Entity
public class Person {
	
	
	@Id
	@GeneratedValue
	private int id;
	
	private String nama;
	
	private String alamat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

}
