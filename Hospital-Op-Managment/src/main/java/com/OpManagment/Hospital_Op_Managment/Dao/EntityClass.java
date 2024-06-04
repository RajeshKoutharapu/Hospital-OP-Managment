package com.OpManagment.Hospital_Op_Managment.Dao;

import java.time.LocalDate;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="optable")
public class EntityClass {
@Override
	public String toString() {
		return "EntityClass [id=" + id + ", pname=" + pname + ", plocation=" + plocation + ", page=" + page
				+ ", pdoctor=" + pdoctor + ", rigesterDay=" + rigesterDay + ", lastDay=" + lastDay + "]";
	}
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    private String pname;
    private String plocation;
    private Integer page;
    private String pdoctor;
    private LocalDate rigesterDay;
    private LocalDate lastDay;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPlocation() {
		return plocation;
	}
	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public String getPdoctor() {
		return pdoctor;
	}
	public void setPdoctor(String pdoctor) {
		this.pdoctor = pdoctor;
	}
	public LocalDate getRigesterDay() {
		return rigesterDay;
	}
	public void setRigesterDay(LocalDate rigesterDay) {
		this.rigesterDay = rigesterDay;
	}
	public LocalDate getLastDay() {
		return lastDay;
	}
	public void setLastDay(LocalDate lastDay) {
		this.lastDay = lastDay;
	}
	public EntityClass(Integer id, String pname, String plocation, Integer page, String pdoctor, LocalDate rigesterDay,
			LocalDate lastDay) {
		super();
		this.id = id;
		this.pname = pname;
		this.plocation = plocation;
		this.page = page;
		this.pdoctor = pdoctor;
		this.rigesterDay = rigesterDay;
		this.lastDay = lastDay;
	}
	public EntityClass() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
}
