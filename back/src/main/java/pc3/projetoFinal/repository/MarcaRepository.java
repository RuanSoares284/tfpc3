package pc3.projetoFinal.repository;


import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import pc3.projetoFinal.dto.MarcaDTO;
import pc3.projetoFinal.enums.Marcas;


@Repository
public interface MarcaRepository extends JpaRepository<MarcaDTO, Integer>{
	
	
	List<MarcaDTO> findAll();
	Optional<MarcaDTO> findById(Integer id);
	MarcaDTO inserir(MarcaDTO marca);
	MarcaDTO alterar(MarcaDTO marca);
	void excluir(Integer id);
	List<MarcaDTO> findByMarca(Marcas marca);

	
	
}
