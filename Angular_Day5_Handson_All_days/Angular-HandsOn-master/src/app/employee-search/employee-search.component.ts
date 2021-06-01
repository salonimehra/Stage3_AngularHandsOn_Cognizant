import { Component, Input, OnInit } from '@angular/core';
import { EmpInfoComponent } from '../emp-info/emp-info.component';
import { Employee } from '../employee';
import {EmployeeserviceService} from '../employeeservice.service'
@Component({
  selector: 'app-employee-search',
  templateUrl: './employee-search.component.html',
  styleUrls: ['./employee-search.component.css']
})
export class EmployeeSearchComponent implements OnInit {
  
  constructor(private employeeService:EmployeeserviceService) { }
  name:any;
  names:EmpInfoComponent=new EmpInfoComponent(this.employeeService);
  employee:Employee[]=this.employeeService.employee;
  empFiltered: Employee[]=this.employee;

  ngOnInit(): void {
  } 
  search(nameSearch:any){
    this.empFiltered=this.employee.filter(emp=>emp.name.toLowerCase().startsWith(nameSearch.toLowerCase()));
    console.log(this.empFiltered)
    this.ngOnInit();
  }
}