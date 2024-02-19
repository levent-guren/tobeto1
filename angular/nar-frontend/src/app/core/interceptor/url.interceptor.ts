import { HttpInterceptorFn } from '@angular/common/http';

export const urlInterceptor: HttpInterceptorFn = (req, next) => {
  let url = req.url;
  if (!url.startsWith('/assets/')) {
    url = 'http://localhost:8080/api/v1' + url;
  }
  let newReq = req.clone({
    url,
  });
  return next(newReq);
};
