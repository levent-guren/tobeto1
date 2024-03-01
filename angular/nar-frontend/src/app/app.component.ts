import { Component, Inject, OnInit } from '@angular/core';
import { APP_CONFIG } from './app.config';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit {

  constructor(
    // @Inject(APP_CONFIG) private appConfig: any,
  ) {}

  ngOnInit(): void {
    // console.log('App Component Init');
    // console.log(this.appConfig);
  }
}
