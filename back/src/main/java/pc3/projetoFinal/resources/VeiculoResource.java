package pc3.projetoFinal.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pc3.projetoFinal.dto.VeiculoDTO;
import pc3.projetoFinal.service.VeiculoService;


@RestController
@RequestMapping("/api/v1/veiculos")


public class VeiculoResource {
	
	@Autowired
	private VeiculoService veiculoService;

	@GetMapping()
	public List<VeiculoDTO> get() {
		VeiculoService veiculoService = new VeiculoService();
		return veiculoService.findAll();
	}
	
	@GetMapping
	public ResponseEntity<List<VeiculoDTO>> findAll(){
	List<VeiculoDTO> veiculos = veiculoService.findAll();
	if(veiculos == null || veiculos.isEmpty()) {
	return new ResponseEntity<List<VeiculoDTO>>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<List<VeiculoDTO>>(veiculos, HttpStatus.OK);
	}
	
	
	@PostMapping
	public VeiculoDTO create(@RequestBody VeiculoDTO veiculo){
	return veiculoService.inserir(veiculo);
	}
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<?> findById(@PathVariable Integer id){
	return veiculoService.findById(id)
	.map(record -> ResponseEntity.ok().body(record))
	.orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<VeiculoDTO> update(@PathVariable("id") Integer id, @RequestBody VeiculoDTO veiculo) {
	return veiculoService.findById(id)
	.map(record -> {
	record.setPlaca(veiculo.getPlaca());
	record.setCor(veiculo.getCor());
	record.setAnoModelo(veiculo.getAnoModelo());
	record.setMarca(veiculo.getMarca());
	VeiculoDTO updated = veiculoService.update(record);
	return ResponseEntity.ok().body(updated);
	}).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(path ={"/{id}"})
	public ResponseEntity<?> delete(@PathVariable Integer id) {
	return veiculoService.findById(id)
	.map(record -> {
	veiculoService.deleteById(id);
	return ResponseEntity.ok().build();
	}).orElse(ResponseEntity.notFound().build());
	}
	
	

	
}
