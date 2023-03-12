package entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
@SequenceGenerator(name="seq_usuario", sequenceName="seq_usuario", allocationSize=1, initialValue=1)
public class Usuario implements Serializable {

	
	private static final long serialVersionUID = -5224464036737881836L;
	
	//===============================================================================================================================================================================================================================================================//
	// ATRIBUTOS //
	//===========//
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_usuario")
	private Long id;
	private String nome;
	private String email;
	
	//===============================================================================================================================================================================================================================================================//
	// GETTERS E SETTERS //
	//===================//
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
