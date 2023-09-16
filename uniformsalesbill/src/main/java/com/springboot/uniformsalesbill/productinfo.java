package com.springboot.uniformsalesbill;

import javax.persistence.*;
	@Entity
	@Table(name = "products")
	public class productinfo {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String description;
	    private double price;
	    // Other fields, getters, setters, and constructors
	}


