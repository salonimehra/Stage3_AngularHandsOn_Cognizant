import { Component, OnInit } from '@angular/core';
import {Employee} from '../employee'
import { EmployeeserviceService } from '../employeeservice.service';
@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.css']
})
export class EditEmployeeComponent implements OnInit {

  constructor(private employeeService:EmployeeserviceService) { } 
  departments = [

    { id: 1, name: "Payroll" },
    
    { id: 2, name: "Internal" },
    
    { id: 3, name: "HR" }];

    
    employee:Employee=this.employeeService.employee[0];

  ngOnInit(): void {
  }
  formSubmit(data: any){
    console.log(data)

  }

}
