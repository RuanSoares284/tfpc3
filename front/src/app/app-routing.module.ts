import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { MarcaCreateComponent } from './marca/marca-create/components/marca-create/marca-create.component';
import { VeiculoCreateComponent } from './veiculo/veiculo-create/components/veiculo-create/veiculo-create.component';

const routes: Routes = [
  { path: '',  redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'nova-marca', component: MarcaCreateComponent },
  { path: 'novo-veiculo', component: VeiculoCreateComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
