package pc3.projetoFinal.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pc3.projetoFinal.dto.VeiculoDTO;
import pc3.projetoFinal.repository.VeiculoRepository;


@Service
public class VeiculoService {

@Autowired
private VeiculoRepository veiculoRepository;

	public List<VeiculoDTO> findAll(){
		return veiculoRepository.findAll();
		}
	
	public VeiculoDTO inserir(VeiculoDTO veiculo) {
		return veiculoRepository.inserir(veiculo);
		}
	
	public VeiculoDTO save(VeiculoDTO veiculo) {
		return veiculoRepository.inserir(veiculo);
		}
	
	public Optional<VeiculoDTO> findById(Integer id) {
		return veiculoRepository.findById(id);
		}
	
		public VeiculoDTO update(VeiculoDTO veiculo) {
		return veiculoRepository.alterar(veiculo);
		}
		
		public void deleteById(Integer id) {
		veiculoRepository.excluir(id);
		}
}
