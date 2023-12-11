import { Component } from '@angular/core';
import { VeiculoService } from 'src/app/veiculo/veiculo.service';
import { Veiculo } from 'src/app/veiculo/models/veiculo.models';

@Component({
  selector: 'app-veiculo-create',
  templateUrl: './veiculo-create.component.html',
  styleUrls: ['./veiculo-create.component.css']
})
export class VeiculoCreateComponent {
  placa!: string;
  cor!: string;
  anoModelo!: number;
  marca!: string;
 
  constructor(private veiculoService: VeiculoService){}

  save(){
    const veiculo: Veiculo = {placa: this.placa, cor: this.cor, anoModelo: this.anoModelo, marca: this.marca};
    this.veiculoService.save(veiculo).subscribe((res) => {
      console.log(res);
    },
    error => console.log(error));
  }

}
