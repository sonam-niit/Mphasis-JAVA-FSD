import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title:string = 'My First Angular APP';
  fname:string="Sonam";
  lname:string="Soni";
  url:string="http://www.google.com";
  imgurl:string="./assets/images/img1.png";
  h:number=100;
  w:number=150;
  message="You have clicked on this button";
  flag=false;
  we=700;
  showMe(){
    this.flag=!this.flag;
  }
  products=[
    {name:"Pencil",price:10.45,available:"09-03-2022",rating:4.5},
    {name:"Eraser",price:5.3,available:"03-03-2022",rating:4.0},
    {name:"Pen",price:15.00,available:"01-02-2022",rating:4.7},
    {name:"Scale",price:25,available:"01-03-2022",rating:3.5}
  ]
}
