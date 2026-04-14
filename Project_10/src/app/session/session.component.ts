import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-session',
  templateUrl: './session.component.html',
  styleUrls: ['./session.component.css']
})
export class SessionComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.SESSION, locator, route);
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.sessionName);
    flag = flag && validator.isNotNullObject(form.startDate);
    flag = flag && validator.isNotNullObject(form.endDate);
    flag = flag && validator.isNotNullObject(form.sessionStatus);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.sessionName = data.sessionName;
    form.startDate = data.startDate;
    form.endDate = data.endDate;
    form.sessionStatus = data.sessionStatus;
  }
}