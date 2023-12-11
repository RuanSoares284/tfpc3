package pc3.projetoFinal.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String placa;
	private String cor;
	private Integer anoModelo;
	
	
	@ManyToOne
	@JoinColumn(name = "id_marca", nullable = true, updatable = true)
	private Marca marca;
	
	public Veiculo(Integer id, String placa, String cor, Integer anoModelo, Marca marca) {
		super();
		this.id = id;
		this.placa = placa;
		this.cor = cor;
		this.anoModelo = anoModelo;
		this.marca = marca;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public Integer getAnoModelo() {
		return anoModelo;
	}


	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}


	public Marca getMarca() {
		return marca;
	}


	public void setMarca( Marca marca) {
		this.marca = marca;
	}


	
	
	
	
}
