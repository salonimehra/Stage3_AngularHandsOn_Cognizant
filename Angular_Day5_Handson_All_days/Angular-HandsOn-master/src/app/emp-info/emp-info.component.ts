import { Component, Input, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeserviceService } from '../employeeservice.service';

@Component({
  selector: 'app-emp-info',
  templateUrl: './emp-info.component.html',
  styleUrls: ['./emp-info.component.css']
})
export class EmpInfoComponent implements OnInit {
  constructor(private employeeService:EmployeeserviceService) {
   }
   @Input()
  employee!: Employee;
  ngOnInit(): void {
  } 
}
