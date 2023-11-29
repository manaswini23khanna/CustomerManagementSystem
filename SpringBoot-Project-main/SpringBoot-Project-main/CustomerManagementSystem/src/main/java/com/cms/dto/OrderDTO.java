package com.cms.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.cms.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
	
	@NotNull(message="Order Id should not be null")
	private int id;
	
	@NotBlank(message="Order Name should not be blank")
	@NotNull(message="Order Name should not be null")
	private String name;
	
	@NotNull
	private double price;
	
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	Customer customer;
	
	
}
