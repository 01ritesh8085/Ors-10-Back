import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-shopping',
  templateUrl: './shopping.component.html',
  styleUrls: ['./shopping.component.css']
})
export class ShoppingComponent  extends BaseCtl{

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
        super(locator.endpoints.SHOPPING, locator, route);
      }

 onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.productName);
    flag = flag && validator.isNotNullObject(form.shopName);
    flag = flag && validator.isNotNullObject(form.productPrice);
    flag = flag && validator.isNotNullObject(form.dob);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.productName = data.productName;
    form.shopName = data.shopName;
    form.productPrice = data.productPrice;
    form.dob = data.dob;
  }
}
