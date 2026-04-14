import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-enrollment',
  templateUrl: './enrollment.component.html'
})
export class EnrollmentComponent extends BaseCtl {

  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.ENROLLMENT, locator, route);
  }

  validateForm(form) {
    let v = this.serviceLocator.dataValidator;
    return v.isNotNullObject(form.enrollmentCode)
      && v.isNotNullObject(form.studentName)
      && v.isNotNullObject(form.enrollmentDate)
      && v.isNotNullObject(form.enrollmentStatus);
  }

  populateForm(form, data) {
    form.id = data.id;
    form.enrollmentCode = data.enrollmentCode;
    form.studentName = data.studentName;
    form.enrollmentDate = data.enrollmentDate;
    form.enrollmentStatus = data.enrollmentStatus;
  }
}