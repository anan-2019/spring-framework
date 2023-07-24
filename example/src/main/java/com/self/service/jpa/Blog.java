package com.self.service.jpa;

import javax.persistence.*;

/**
 * @Classname Blog
 * @Date 2023/7/24 13:05
 * @Created by anan
 * @Description description here
 */
@Entity
@Table(name = "blog")
public class Blog {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", nullable = false)
	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
