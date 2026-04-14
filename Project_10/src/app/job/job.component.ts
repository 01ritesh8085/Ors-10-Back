import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-job',
  templateUrl: './job.component.html',
  styleUrls: ['./job.component.css']
})
export class JobComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.JOB, locator, route);
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.title);
    flag = flag && validator.isNotNullObject(form.dob);
    flag = flag && validator.isNotNullObject(form.experience);
    flag = flag && validator.isNotNullObject(form.status);
    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.title = data.title;
    form.dob = data.dob;
    form.experience = data.experience;
    form.status = data.status;
  }
}
