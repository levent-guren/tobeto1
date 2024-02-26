import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IlanKartComponent } from './ilan-kart.component';

describe('IlanKartComponent', () => {
  let component: IlanKartComponent;
  let fixture: ComponentFixture<IlanKartComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [IlanKartComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(IlanKartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
