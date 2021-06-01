import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditEmployeeReactiveComponent } from './edit-employee-reactive/edit-employee-reactive.component';
import { EditEmployeeComponent } from './edit-employee/edit-employee.component';
import { EmployeeSearchComponent } from './employee-search/employee-search.component';
import { IncrementComponent } from './increment/increment.component';
import { MainPageComponent } from './main-page/main-page.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { ViewEmployeeByIDComponent } from './view-employee-by-id/view-employee-by-id.component';
import { ViewEmployeeComponent } from './view-employee/view-employee.component';

const routes: Routes = [
  {path:'',component:MainPageComponent,pathMatch:"full"},
  {path:'viewEmployee',component:ViewEmployeeComponent},
  {path:'main',component:MainPageComponent},
  {path:'editEmployee',component:EditEmployeeComponent},
  {path:'editEmployeeReactive',component:EditEmployeeReactiveComponent},
  {path:'increment',component:IncrementComponent},
  {path:'searchEmployee',component:EmployeeSearchComponent},
  {path:'searchEmployee/:id',component:EditEmployeeReactiveComponent},
  {path:'**',component:PagenotfoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
