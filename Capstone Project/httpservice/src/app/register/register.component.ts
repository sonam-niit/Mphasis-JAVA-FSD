import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  pro:Product= new Product();
  constructor(private service:ProductService,private router:Router) { }

  addProduct(){
    this.service.addProduct(this.pro).subscribe(
      (data)=>{console.log(data);
      });
    this.router.navigate(['list']);
  }
  ngOnInit(): void {
  }

}
