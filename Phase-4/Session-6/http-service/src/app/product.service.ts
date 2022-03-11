import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  //api link
  url:string="http://localhost:8080/myapi/products";

  constructor(private http:HttpClient) { }

  getProducts():Observable<Product[]>
  {
      return this.http.get<Product[]>(this.url);
  }
}
