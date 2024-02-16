import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(
    private httpClient: HttpClient,
  ) { }

  login(email:string , password: string):Observable<any> {
    return this.httpClient.post('http://localhost:8080/api/v1/login', {email, password});
  }
}
