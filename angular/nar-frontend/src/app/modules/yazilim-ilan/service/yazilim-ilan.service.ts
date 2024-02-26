import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { YazilimIlan } from '../dto/yazilimIlan';

@Injectable({
  providedIn: 'root'
})
export class YazilimIlanService {
  constructor(
    private httpClient: HttpClient,
  ) { }

  yazilimIlanVer(ilanVer: any):Observable<any> {
    return this.httpClient.post<any>('/yazilimIlanVer', ilanVer);
  }

  getTumYazilimIlanlari():Observable<YazilimIlan[]> {
    return this.httpClient.get<YazilimIlan[]>('/yazilimIlanlari');
  }

}
