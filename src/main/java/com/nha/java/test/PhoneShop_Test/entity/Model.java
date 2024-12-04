package com.nha.java.test.PhoneShop_Test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbModel")
public class Model {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "modelId")
	private Integer modelId;
	@Column(name = "modelName")
	private String modelName;
	
	@ManyToOne
	@JoinColumn(name = "brandId")
	private Brand brandId;
}		
