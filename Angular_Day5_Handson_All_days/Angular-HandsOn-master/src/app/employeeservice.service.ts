import { Injectable } from '@angular/core';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeserviceService {
  employee:Employee[]=[{id:1,
    name:"Ryuzaki",salary:10000,permanent:false,department:{id:1,name:"payroll"},Skills:[{id:1,name:"Html"},{id:2,name:"CSS"},{id:3,name:"Javascript"}]},{id:2,
      name:"Prince",salary:12000,permanent:false,department:{id:1,name:"payroll"},Skills:[{id:1,name:"Html"},{id:2,name:"CSS"},{id:3,name:"Javascript"}]},{id:3,
        name:"Kashaf",salary:13000,permanent:false,department:{id:1,name:"payroll"},Skills:[{id:1,name:"Html"},{id:2,name:"CSS"},{id:3,name:"Javascript"}]},{id:4,
          name:"Nehal",salary:14000,permanent:false,department:{id:1,name:"payroll"},Skills:[{id:1,name:"Html"},{id:2,name:"CSS"},{id:3,name:"Javascript"}]},{id:5,
            name:"Saloni",salary:15000,permanent:false,department:{id:1,name:"payroll"},Skills:[{id:1,name:"Html"},{id:2,name:"CSS"},{id:3,name:"Javascript"}]},{id:6,
              name:"Kshitij",salary:15000,permanent:false,department:{id:1,name:"payroll"},Skills:[{id:1,name:"Html"},{id:2,name:"CSS"},{id:3,name:"Javascript"}]}]
  constructor() { }
  public getEmployees(){
    return this.employee;
  }
  public searchEmployeeById(id:number){
    for(let emp of this.employee){
      if(emp.id==id){
        return emp;
      }
    }
    return this.employee[0];
  }
}
