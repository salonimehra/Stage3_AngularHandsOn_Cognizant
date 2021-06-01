import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeserviceService } from '../employeeservice.service';

@Component({
  selector: 'app-view-employee-by-id',
  templateUrl: './view-employee-by-id.component.html',
  styleUrls: ['./view-employee-by-id.component.css']
})
export class ViewEmployeeByIDComponent implements OnInit {

  constructor(private route:ActivatedRoute,private employeeService:EmployeeserviceService) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.paramMap.get('id');
    console.log(this.id);
    this.employee=this.employeeService.searchEmployeeById(this.id);
  }
  id:any;
  employee!: Employee;


}
