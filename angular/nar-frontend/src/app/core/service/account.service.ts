import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { SifreDegistirRequest } from '../dto/sifreDegistirRequest';
import { SuccessResponse } from '../../shared/dto/successResponse';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  constructor(
    private httpClient: HttpClient,
  ) { }

  public sifreDegistir(dto: SifreDegistirRequest): Observable<SuccessResponse> {
    return this.httpClient.post<SuccessResponse>("/sifreDegistir", dto);
  }
}
