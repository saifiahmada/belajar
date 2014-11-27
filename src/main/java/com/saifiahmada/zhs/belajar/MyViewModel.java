package com.saifiahmada.zhs.belajar;

import org.springframework.beans.factory.annotation.Autowired;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import com.saifiahmada.zhs.belajar.entity.Person;
import com.saifiahmada.zhs.belajar.service.PersonService;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class MyViewModel {
	
	@WireVariable
	private PersonService personService;

	private String nama;

	@Init
	public void init() {
		nama = "";
	}

	@Command
	@NotifyChange("nama")
	public void cmd() {
		Person person = new Person();
		person.setNama("Saifi Ahmada");
		person.setAlamat("Banjarmasin");
		
		personService.save(person); 
		nama = person.getNama();
		System.out.println("OK");
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
}
