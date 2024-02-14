import { Component } from '@angular/core';

@Component({
  selector: 'app-ornek1',
  standalone: true,
  imports: [],
  template: `deneme {{ title }} <br/>
  {{ 2 * 3 }}
  {{ test() }}
  {{ adres }} <br/>
  {{ deger }}
  <input id="{{txt1}}" [value]="deger" [disabled]="pasif" />
  <br/>
  <button (click)="butonaBasildi()">Butona bas</button>
  `,
  styleUrl: './ornek1.component.scss'
})
export class Ornek1Component {
  title : string = 'Başlık';
  adres = window.location.href;
  txt1 = 'adi';
  pasif = false;
  deger = "deneme";

  test() : number {
    // const x = 4;
    return 8;
  }
  butonaBasildi() {
    this.deger = "değiştirildi";
  }
}
