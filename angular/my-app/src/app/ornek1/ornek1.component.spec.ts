import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ornek1Component } from './ornek1.component';

describe('Ornek1Component', () => {
  let component: Ornek1Component;
  let fixture: ComponentFixture<Ornek1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ornek1Component]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(Ornek1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
