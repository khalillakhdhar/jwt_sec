package org.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data @AllArgsConstructor @NoArgsConstructor
public class Task {
	public Task(Object object, String t) {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	private Long id;
	private String taskName;

}
