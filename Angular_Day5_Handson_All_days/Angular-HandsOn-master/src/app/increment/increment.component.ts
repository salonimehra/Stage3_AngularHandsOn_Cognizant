import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-increment',
  templateUrl: './increment.component.html',
  styleUrls: ['./increment.component.css']
})
export class IncrementComponent implements OnInit {
  data:any;
  increment={quantity:0}
  constructor() {
    
   }

  ngOnInit(): void {
  }
  
 addData(){
   this.data="Click Me Button is Pressed";
   this.increment.quantity+=1;
}
subData(){
  this.increment.quantity-=1;
}


}