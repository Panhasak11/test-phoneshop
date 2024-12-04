package com.nha.java.test.PhoneShop_Test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbBrand")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brandId")
	private Integer brandId;
	
	@Column(name = "brandName")
	private String brandName;
}
