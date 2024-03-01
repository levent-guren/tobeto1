import { Component } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { LoginService } from '../../service/login.service';
import { AccountService } from '../../service/account.service';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrl: './account.component.scss'
})
export class AccountComponent {
  accountForm = this.fb.nonNullable.group({
    email: { value: this.loginService.email, disabled: true },
    eskiSifre: "",
    sifre: ["", [ Validators.required, Validators.minLength(3), Validators.pattern(/admin/)/*, yasakliIsimKontrolu */] ],
    sifre2: "",
  }, {validators: [/*sifreTekrariKontrolu*/]});

  constructor(
    private fb: FormBuilder,
    private loginService: LoginService,
    private accountService: AccountService,
    private toastr: ToastrService,
  ) {}

  submit() {
    let eskiSifre = this.accountForm.get('eskiSifre')!.value;
    let yeniSifre = this.accountForm.get('sifre')!.value;
    this.accountService.sifreDegistir({eskiSifre, yeniSifre }).subscribe({
      next: (sonuc) => {
        console.log(sonuc);
        this.toastr.info("Şifre değiştirilmiştir.");
      }
    });
  }
}
