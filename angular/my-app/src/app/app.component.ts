import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ornek1Component } from './ornek1/ornek1.component';
import { Ornek2Component } from './ornek2/ornek2.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, Ornek1Component, Ornek2Component],
  template: `
  <app-ornek2></app-ornek2>
  `,
  styleUrl: './app.component.scss'
})
export class AppComponent {
  
}
