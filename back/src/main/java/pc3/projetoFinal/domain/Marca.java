package pc3.projetoFinal.domain;


import pc3.projetoFinal.enums.Marcas;


import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Marca implements Serializable{
		
	
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)		
			
		private Integer id;
		private String sigla;
		private Marcas descricao;
		
		
		public Marca(Integer id, String sigla, Marcas descricao) {
			super();
			this.id = id;
			this.sigla = sigla;
			this.descricao = descricao;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getSigla() {
			return sigla;
		}


		public void setSigla(String sigla) {
			this.sigla = sigla;
		}


		public Marcas getDescricao() {
			return descricao;
		}


		public void setDescricao(Marcas descricao) {
			this.descricao = descricao;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
}
