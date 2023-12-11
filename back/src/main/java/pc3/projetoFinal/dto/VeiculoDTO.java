package pc3.projetoFinal.dto;

import pc3.projetoFinal.domain.Veiculo;
import pc3.projetoFinal.domain.Marca;

public class VeiculoDTO {
	
		
		private Integer id;
		private String placa;
		private String cor;
		private Integer anoModelo ;
		private Marca marca; 
		
		public VeiculoDTO(Veiculo veiculo) {
			this.id = veiculo.getId();
			this.placa = veiculo.getPlaca();
			this.cor = veiculo.getCor();
			this.anoModelo = veiculo.getAnoModelo();
			this.marca = veiculo.getMarca();
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

		public void setMarca(Marca marca) {
			this.marca = marca;
		}


}
