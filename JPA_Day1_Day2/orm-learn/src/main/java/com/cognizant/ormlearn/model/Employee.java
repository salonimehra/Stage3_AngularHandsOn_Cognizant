package com.cognizant.ormlearn.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "employee_skill",joinColumns = @JoinColumn(name = "es_em_id"),inverseJoinColumns = @JoinColumn(name = "es_sk_id"))
	private Set<Skill> skillList;
	
	@ManyToOne
	@JoinColumn(name = "em_dp_id")
	private Department department;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="em_id")
	private int id;
	
	@Column(name="em_name")
	private String name;
	
	@Column(name="em_salary")
	private BigDecimal salary;
	
	@Column(name="em_permanent")
	private boolean permanent;
	
	@Column(name="em_dateOfBirth")
	private Date dateOfBirth;
	
	public Set<Skill> getSkillList() {
		return skillList;
	}
	public void setSkillList(Set<Skill> skillList) {
		this.skillList = skillList;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public boolean isPermanent() {
		return permanent;
	}
	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
}
