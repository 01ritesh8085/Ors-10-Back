import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-compensation',
  templateUrl: './compensation.component.html',
  styleUrls: ['./compensation.component.css']
})
export class CompensationComponent extends BaseCtl {


  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.COMPENSATION, locator, route);
  }
  
   onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.staffMember);
    flag = flag && validator.isNotNullObject(form.paymentAmount);
    flag = flag && validator.isNotNullObject(form.dateApplied);
    flag = flag && validator.isNotNullObject(form.state);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.state = data.staffMember;
    form.paymentAmount = data.paymentAmount;
    form.dateApplied = data.dateApplied;
    form.state = data.state;
  }
}