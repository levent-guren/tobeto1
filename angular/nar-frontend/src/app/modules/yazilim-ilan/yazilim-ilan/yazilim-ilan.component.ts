import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { YazilimIlanService } from '../service/yazilim-ilan.service';
import { YazilimIlan } from '../dto/yazilimIlan';

@Component({
  selector: 'app-yazilim-ilan',
  templateUrl: './yazilim-ilan.component.html',
  styleUrl: './yazilim-ilan.component.scss'
})
export class YazilimIlanComponent implements OnInit {
  ilanlar: YazilimIlan[] = [];

  constructor(
    public router: ActivatedRoute,
    private yazilimIlanService: YazilimIlanService,
  ) {}

  ngOnInit(): void {
    this.yazilimIlanService.getTumYazilimIlanlari().subscribe({
      next: (ilanlar => {
        this.ilanlar = ilanlar;
      })
    });
  }


  kartSecildi(mesaj: string) {
    console.log('Kart secildi: '+mesaj);
  }
    
}
