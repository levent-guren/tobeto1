import { Component } from '@angular/core';
import { LoginService } from '../service/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {
  email = '';
  password = '';

  constructor(
    private loginService: LoginService, 
  ) {
  }

  login() {
    console.log(this.email, this.password);
    this.loginService.login(this.email, this.password).subscribe({
      next: (resp) => {
        console.log(resp);
      },
      error: (err)=> {
        console.log(err);
      }
    });
  }
}
