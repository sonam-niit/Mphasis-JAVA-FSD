import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { }

  getUser()
  {
      return {name:"sonam",email:"sonam@gmail.com",address:"mumbai"};
  }
}
