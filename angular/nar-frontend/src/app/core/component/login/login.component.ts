import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../../service/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {
  email = 'levent';
  password = 'levent';

  constructor(
    private loginService: LoginService,
    private router: Router,
  ) {
  }

  login() {
    this.loginService.login(this.email, this.password).subscribe({
      next: () => {
        this.router.navigate(['/menu']);
      },
      error: (err)=> {
        console.log(err);
      }
    });
  }
}