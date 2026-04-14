import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PriopityComponent } from './priopity.component';

describe('PriopityComponent', () => {
  let component: PriopityComponent;
  let fixture: ComponentFixture<PriopityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PriopityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PriopityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
