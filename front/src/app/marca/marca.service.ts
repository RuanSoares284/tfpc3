import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs";
import { Marca } from 'src/app/marca/models/marca.models';


@Injectable({
  providedIn: 'root'
})

export class MarcaService {
  private API = 'http://localhost:8080/api/v1/marcas';
  constructor(private httpClient: HttpClient) {
  }
  save(marca: Marca): Observable<Marca>{
    return this.httpClient.post<Marca>(this.API,marca);
  }
}

