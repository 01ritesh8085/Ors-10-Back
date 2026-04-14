import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-transport',
  templateUrl: './transport.component.html'
})
export class TransportComponent extends BaseCtl {

  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.TRANSPORT, locator, route);
  }

  validateForm(form) {
    let v = this.serviceLocator.dataValidator;
    return v.isNotNullObject(form.vehicleNumber)
      && v.isNotNullObject(form.driverName)
      && v.isNotNullObject(form.vehicleType)
      && v.isNotNullObject(form.transportStatus);
  }

  populateForm(form, data) {
    form.id = data.id;
    form.vehicleNumber = data.vehicleNumber;
    form.driverName = data.driverName;
    form.vehicleType = data.vehicleType;
    form.transportStatus = data.transportStatus;
  }
}