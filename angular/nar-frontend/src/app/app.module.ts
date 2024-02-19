import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './core/component/login/login.component';
import { ErrorComponent } from './core/component/error/error.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, provideHttpClient, withInterceptors } from '@angular/common/http';
import { DenemelerComponent } from './denemeler/denemeler.component';
import { urlInterceptor } from './core/interceptor/url.interceptor';
import { MenuComponent } from './core/component/menu/menu.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ErrorComponent,
    DenemelerComponent,
    MenuComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [
    provideHttpClient(withInterceptors([urlInterceptor]))
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
