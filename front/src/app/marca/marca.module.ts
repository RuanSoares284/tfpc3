import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MarcaCreateComponent } from './marca-create/components/marca-create/marca-create.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  imports: [
    CommonModule,
    FormsModule
  ],
  declarations: [
    MarcaCreateComponent
  ],
  exports:[
    MarcaCreateComponent
  ]
})
export class MarcaModule { }
