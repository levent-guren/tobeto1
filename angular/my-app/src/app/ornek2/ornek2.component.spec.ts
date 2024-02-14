import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ornek2Component } from './ornek2.component';

describe('Ornek2Component', () => {
  let component: Ornek2Component;
  let fixture: ComponentFixture<Ornek2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ornek2Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Ornek2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
