import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user',
  //template:"<h1>We are working on this check after some time</h1>",
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  //service injected
  constructor(private service: UserService) { }

  user:any;
  ngOnInit(): void {
    this.user=this.service.getUser();
  }

}
