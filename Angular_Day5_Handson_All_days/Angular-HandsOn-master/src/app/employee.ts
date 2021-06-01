import {Department} from './Department';
import {Skills} from './skill';
export interface Employee{
    id:number;
    name:String;
    salary:number;
    permanent:boolean;
    department:Department;
    Skills:Skills[];
}