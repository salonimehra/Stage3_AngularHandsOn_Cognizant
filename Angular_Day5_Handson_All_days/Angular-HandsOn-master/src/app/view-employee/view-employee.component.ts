import { Component, OnInit } from '@angular/core';
import {DatePipe} from '@angular/common'
import {Employee} from '../employee'

@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css']
})
export class ViewEmployeeComponent implements OnInit {
  employee:Employee;
  dateOfBirth:any;
  constructor() { 
    
    this.employee={id:1,
      name:"Ryuzaki",salary:10000,permanent:false,department:{id:1,name:"payroll"},Skills:[{id:1,name:"Html"},{id:2,name:"CSS"},{id:3,name:"Javascript"}]
    };
    const datepipe:DatePipe=new DatePipe('en-US');
    this.dateOfBirth=datepipe.transform(new Date('12/31/2000'),'MM-dd-YYYY');
  }

  ngOnInit(): void {
  }

}
