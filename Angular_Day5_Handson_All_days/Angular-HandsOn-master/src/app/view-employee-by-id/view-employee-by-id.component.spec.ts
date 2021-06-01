import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewEmployeeByIDComponent } from './view-employee-by-id.component';

describe('ViewEmployeeByIDComponent', () => {
  let component: ViewEmployeeByIDComponent;
  let fixture: ComponentFixture<ViewEmployeeByIDComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewEmployeeByIDComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewEmployeeByIDComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
