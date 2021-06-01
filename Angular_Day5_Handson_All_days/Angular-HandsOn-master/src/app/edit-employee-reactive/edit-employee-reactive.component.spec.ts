import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditEmployeeReactiveComponent } from './edit-employee-reactive.component';

describe('EditEmployeeReactiveComponent', () => {
  let component: EditEmployeeReactiveComponent;
  let fixture: ComponentFixture<EditEmployeeReactiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditEmployeeReactiveComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditEmployeeReactiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
