import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  loggedIn = false;
  token = "";
  email = "";
  password = "";

  constructor(
    private httpClient: HttpClient,
  ) { }

  login(email:string , password: string):Observable<any> {
    return this.httpClient.post<any>('/login', {email, password}).pipe(
      map(data => {
        this.loggedIn = true;
        this.token = data.token;
        this.email = email;
        this.password = password;
        localStorage.setItem('token', data.token);
        localStorage.setItem('email', email);
        localStorage.setItem('password', password);
        return data;
      })
    );
  }

  relogin():Observable<any> {
    return this.login(this.email, this.password);
  }
  
  logout() {
    this.loggedIn = false;
    this.token = "";
    this.email = "";
    this.password = "";
    localStorage.clear();
  }
}
