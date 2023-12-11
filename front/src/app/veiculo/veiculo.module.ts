import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { VeiculoCreateComponent } from './veiculo-create/components/veiculo-create/veiculo-create.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  imports: [
    CommonModule,
    FormsModule
  ],
  declarations: [
    VeiculoCreateComponent
  ],
  exports:[
    VeiculoCreateComponent
  ]
})
export class VeiculoModule { }
