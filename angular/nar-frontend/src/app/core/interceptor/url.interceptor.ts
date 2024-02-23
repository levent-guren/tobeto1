import { HttpInterceptorFn } from '@angular/common/http';
import { inject } from '@angular/core';
import { LoginService } from '../service/login.service';

export const urlInterceptor: HttpInterceptorFn = (req, next) => {
  let url = req.url;
  let headers = req.headers;
  let loginService = inject(LoginService);

  if (!url.startsWith('/assets/')) {
    url = 'http://localhost:8080/api/v1' + url;
    headers = headers.append('Authorization', 'Bearer ' + loginService.token);
  }
  let newReq = req.clone({
    url,
    headers,
  });
  return next(newReq);
};
