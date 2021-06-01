import { Component, OnInit } from '@angular/core';
import {FormArray, FormBuilder,FormControl,FormGroup,Validators} from '@angular/forms'
import { ActivatedRoute } from '@angular/router';
import{Employee} from '../employee'
import { EmployeeserviceService } from '../employeeservice.service';
@Component({
  selector: 'app-edit-employee-reactive',
  templateUrl: './edit-employee-reactive.component.html',
  styleUrls: ['./edit-employee-reactive.component.css']
})
export class EditEmployeeReactiveComponent implements OnInit {
  employee:Employee={id:0,name:"",salary:0,department:{id:1,name:"CDE"},permanent:true,Skills:[{id:1,name:"HTML"},{id:2,name:"JAVA "}]};
  public departments=[{id:1,name:'payroll'},{id:2,name:'Development'},{id:3,name:"HR"}]
  
  employeeForm=this.fb.group({id:[this.employee.id,Validators.required],name:[this.employee.name,Validators.required],salary:[this.employee.salary],permanent:[this.employee.permanent],department:[this.employee.department],
  Skills:this.fb.array([this.createSkillFormGroup(this.employee.Skills)])
  });
get Skills(){
  return this.employeeForm.get('Skills') as FormArray;
}

  constructor(private fb: FormBuilder,private employeeService:EmployeeserviceService,private route:ActivatedRoute) { }

  private createSkillFormGroup(skill:any): FormGroup{
    return new FormGroup({'id':new FormControl(skill.id),'name':new FormControl(skill.name)})
  }

  public addSkill(skill:any){
    this.Skills.push(this.createSkillFormGroup(skill));
  }

    ngOnInit(): void {
      this.id=this.route.snapshot.paramMap.get('id');
      if(this.id!=null){
        
      this.employee=this.employeeService.searchEmployeeById(this.id);
      this.employeeForm=this.fb.group({id:[this.employee.id,Validators.required],name:[this.employee.name,Validators.required],salary:[this.employee.salary],permanent:[this.employee.permanent],department:[this.employee.department],
        Skills:this.fb.array([])});
        
        this.employee.Skills.forEach((skill)=>this.addSkill(skill))
      }
}
id:any;
  getControls(){
    return (this.employeeForm.get('Skills') as FormArray).controls;
  }
  onSubmit(){
    console.log(this.employeeForm.value)
  }
}
