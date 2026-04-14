import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-coupon',
  templateUrl: './coupon.component.html',
  styleUrls: ['./coupon.component.css']
})
export class CouponComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.COUPON, locator, route);
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.offerCode);
    flag = flag && validator.isNotNullObject(form.discountAmount);
    flag = flag && validator.isNotNullObject(form.expiryDate);
    flag = flag && validator.isNotNullObject(form.offerStatus);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.offerCode = data.offerCode;
    form.discountAmount = data.discountAmount;
    form.expiryDate = data.expiryDate;
    form.offerStatus = data.offerStatus;
  }

}
