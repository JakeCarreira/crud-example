package br.com.crud.dto;

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
public class RestDTO {	
	
	private String name;	
    private String old;
    private String email;

}
