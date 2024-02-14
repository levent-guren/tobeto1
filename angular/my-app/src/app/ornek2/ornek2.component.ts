import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ornek2',
  standalone: true,
  imports: [CommonModule],
  template: `
  <div [class]="success">Ürün kabul edildi</div>
  <div [class.basarili]="b">Ürün kabul edildi</div>
  <div [class]="b ? 'basarili':'basarisiz'">Ürün kontrol</div>
  <div [ngClass]="sitil" >ngClass testi</div>
  <div>
    <button (click)="degistir()">Değiştir</button>
  </div>
  <div [style]="sitil2">sitil kontrol1</div>
  <div [style.color]="renk">sitil kontrol1</div>
  <div [ngStyle]="sitil3">sitil kontrol1</div>
  `,
  styles: `
    .basarili {
      color: #00aa00;
    }  
    .basarisiz {
      color: #ff0000;
    }  
    .yazi1 {
      font-style: italic;
    }
  
  `
})
export class Ornek2Component {
    success = "basarili";
    b = false;
    sitil = {
      "basarili": true,
      yazi1: true,
    };
    sitil2 = {
      'color': 'blue'
    }
    sitil3 = {
      'color': 'blue',
      'font-style': 'italic',
      'font-size': '1.5rem'
    }
    renk = 'cyan';

    degistir() {
      this.b = !this.b;
      this.sitil.basarili = !this.sitil.basarili;
    }
}
