import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html'
})
export class ClientComponent extends BaseCtl {

  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.CLIENT, locator, route);
  }

  validateForm(form) {
    let v = this.serviceLocator.dataValidator;
    return v.isNotNullObject(form.clientName)
      && v.isNotNullObject(form.address)
      && v.isNotNullObject(form.phone)
      && v.isNotNullObject(form.priority);
  }

  populateForm(form, data) {
    form.id = data.id;
    form.clientName = data.clientName;
    form.address = data.address;
    form.phone = data.phone;
    form.priority = data.priority;
  }
}