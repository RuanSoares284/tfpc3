import { Component } from '@angular/core';
import { MarcaService } from 'src/app/marca/marca.service';
import { Marca } from 'src/app/marca/models/marca.models'; 

@Component({
  selector: 'app-marca-create',
  templateUrl: './marca-create.component.html',
  styleUrls: ['./marca-create.component.css']
})
export class MarcaCreateComponent {
  sigla!: string;
  descricao!: string;
 
  constructor(private marcaService: MarcaService){}

  save(){
    const marca: Marca = {sigla: this.sigla, descricao: this.descricao};
    this.marcaService.save(marca).subscribe((res) => {
      console.log(res);
    },
    error => console.log(error));
  }

}
