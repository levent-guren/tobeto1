import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-ilan-kart',
  templateUrl: './ilan-kart.component.html',
  styleUrl: './ilan-kart.component.scss'
})
export class IlanKartComponent {
  @Input() adi = '';
  @Input() soyadi = '';
  @Output() basildi = new EventEmitter();

  kartaBasildi() {
    this.basildi.emit('Karta basildi');
  }
}
