import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.PROFILE, locator, route);
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.fullName);
    flag = flag && validator.isNotNullObject(form.gender);
    flag = flag && validator.isNotNullObject(form.dob);
    flag = flag && validator.isNotNullObject(form.profileStatus);
    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.fullName = data.fullName;
    form.gender = data.gender;
    form.dob = data.dob;
    form.profileStatus = data.profileStatus;
  }

}
