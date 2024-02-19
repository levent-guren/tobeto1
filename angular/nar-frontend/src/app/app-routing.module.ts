import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './core/component/login/login.component';
import { ErrorComponent } from './core/component/error/error.component';
import { DenemelerComponent } from './denemeler/denemeler.component';
import { MenuComponent } from './core/component/menu/menu.component';
import { loginGuard } from './core/guard/login.guard';

const routes: Routes = [
  { path:'', redirectTo: 'login', pathMatch: 'full' },
  { path:'login', component: LoginComponent },
  { path:'menu', component: MenuComponent, canActivate: [loginGuard] },
  { path:'denemeler', component: DenemelerComponent },
  { path:'**', component: ErrorComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
    
}
