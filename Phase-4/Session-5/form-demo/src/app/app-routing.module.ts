import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';
import { RegisterComponent } from './register/register.component';
import { SwitchdemoComponent } from './switchdemo/switchdemo.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [

  // {"path":"",redirectTo:"home"},
  // {"path":"home",component:HomeComponent},
  {"path":"register",component:RegisterComponent},
  {"path":"switch",component:SwitchdemoComponent},
  {"path":"pipe",component:PipeDemoComponent},
  {"path":"user",component:UserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
