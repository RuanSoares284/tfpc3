import { Component } from '@angular/core';
import { environment } from './../environments/environment';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'TFPC3 - Laureane e Ruan';
  /*constructor() {
    console.log(environment.apiUrl); // Logs false for development environment
  }*/
}
