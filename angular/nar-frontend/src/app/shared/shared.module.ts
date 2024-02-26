import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IlanKartComponent } from './components/ilan-kart/ilan-kart.component';



@NgModule({
  declarations: [
    IlanKartComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    IlanKartComponent
  ]
})
export class SharedModule { }
