package pc3.projetoFinal.enums;

public enum Marcas {

	JEEP("Jeep"), FIAT("Fiat"), HYUNDAI("Hyundai");


	private String descricao;
	

	Marcas(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
