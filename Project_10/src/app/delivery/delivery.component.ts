import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-delivery',
  templateUrl: './delivery.component.html'
})
export class DeliveryComponent extends BaseCtl {

  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.DELIVERY, locator, route);
  }

  validateForm(form) {
    let v = this.serviceLocator.dataValidator;
    return v.isNotNullObject(form.deliveryCode)
      && v.isNotNullObject(form.deliveryAddress)
      && v.isNotNullObject(form.deliveryDate)
      && v.isNotNullObject(form.deliveryStatus);
  }

  populateForm(form, data) {
    form.id = data.id;
    form.deliveryCode = data.deliveryCode;
    form.deliveryAddress = data.deliveryAddress;
    form.deliveryDate = data.deliveryDate;
    form.deliveryStatus = data.deliveryStatus;
  }
}