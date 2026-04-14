import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-followup',
  templateUrl: './followup.component.html'
})
export class FollowUpComponent extends BaseCtl {

  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.FOLLOWUP, locator, route);
  }

  validateForm(form) {
    let v = this.serviceLocator.dataValidator;
    return v.isNotNullObject(form.patient)
      && v.isNotNullObject(form.doctor)
      && v.isNotNullObject(form.dob)
      && v.isNotNullObject(form.fees);
  }

  populateForm(form, data) {
    form.id = data.id;
    form.patient = data.patient;
    form.doctor = data.doctor;
    form.dob = data.dob;
    form.fees = data.fees;
  }
}