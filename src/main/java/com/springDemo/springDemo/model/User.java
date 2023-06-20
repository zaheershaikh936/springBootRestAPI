package com.springDemo.springDemo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;

	  private String name;

	  private String email;
	  
	  @OneToOne(cascade=CascadeType.ALL)
	  @JoinColumn(name="fkCourseId")
	  private Course courseId;

}
