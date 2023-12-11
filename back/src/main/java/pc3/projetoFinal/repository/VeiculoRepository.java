package pc3.projetoFinal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import pc3.projetoFinal.dto.VeiculoDTO;
import pc3.projetoFinal.domain.Marca;


@Repository
public interface VeiculoRepository extends JpaRepository<VeiculoDTO, Integer>{

	List<VeiculoDTO> findAll();
	Optional<VeiculoDTO> findById(Integer id);
	List<VeiculoDTO> findByMarca(Marca id);
	VeiculoDTO inserir(VeiculoDTO veiculo);
	VeiculoDTO alterar(VeiculoDTO veiculo);
	void excluir(Integer id);
}
