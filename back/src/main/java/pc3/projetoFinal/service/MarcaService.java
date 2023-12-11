package pc3.projetoFinal.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pc3.projetoFinal.dto.MarcaDTO;
import pc3.projetoFinal.enums.Marcas;
import pc3.projetoFinal.repository.MarcaRepository;



@Service
public class MarcaService {

	@Autowired
	private MarcaRepository marcaRepository;
	
	public List<MarcaDTO> findAll(){
		return marcaRepository.findAll().stream().map(marca -> new MarcaDTO(marca)).collect(Collectors.toList());
		}
	
	public MarcaDTO inserir(MarcaDTO marca) {
		return marcaRepository.inserir(marca);
		}
	

		public Optional<MarcaDTO> findById(Integer id) {
			return  marcaRepository.findById(id);
		}
		
		
		public MarcaDTO update(MarcaDTO marca) {
		return marcaRepository.alterar(marca);
		}
		
		public void deleteById(Integer id) {
			marcaRepository.excluir(id);
			}
		
		public List<MarcaDTO> findByMarca(Marcas marca){
			return (List<MarcaDTO>) marcaRepository.findByMarca(marca);
			}
		
}
