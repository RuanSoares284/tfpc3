package pc3.projetoFinal.dto;




import pc3.projetoFinal.enums.Marcas;

public class MarcaDTO {

		private Integer id;
		private String sigla;
		private Marcas descricao;
		
		
		
		public MarcaDTO(MarcaDTO marca) {
			this.id = marca.getId();
			this.sigla = marca.getSigla();
			this.descricao = marca.getDescricao();
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
		
		
		
}
