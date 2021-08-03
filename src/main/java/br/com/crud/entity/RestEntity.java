package br.com.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor 
@AllArgsConstructor
@Setter
@Getter
@Data
@Table(name = "RESTUSER")
@Entity(name = "RESTUSER")
public class RestEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name= "ID")
	private long id;
	
	@Column(name= "NAME")
	private String name;
	
	@Column(name= "OLD")
    private String old;
	
	@Column(name= "EMAIL")
    private String email;

}
