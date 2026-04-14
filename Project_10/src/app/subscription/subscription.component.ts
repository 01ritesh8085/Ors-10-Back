import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-subscription',
  templateUrl: './subscription.component.html',
  styleUrls: ['./subscription.component.css']
})
export class SubscriptionComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.SUBSCRIPTION, locator, route);
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.planName);
    flag = flag && validator.isNotNullObject(form.planPrice);
    flag = flag && validator.isNotNullObject(form.startDate);
    flag = flag && validator.isNotNullObject(form.endDate);
    flag = flag && validator.isNotNullObject(form.subscriptionStatus);
    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.planName = data.planName;
    form.planPrice = data.planPrice;
    form.startDate = data.startDate;
    form.endDate = data.endDate;
    form.subscriptionStatus = data.subscriptionStatus;
  }
}
