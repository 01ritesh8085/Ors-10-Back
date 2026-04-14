import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css']
})
export class LocationComponent extends BaseCtl {

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
    flag = flag && validator.isNotNullObject(form.city);
    flag = flag && validator.isNotNullObject(form.state);
    flag = flag && validator.isNotNullObject(form.country);
    flag = flag && validator.isNotNullObject(form.locationStatus);
    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.city = data.city;
    form.state = data.state;
    form.country = data.country;
    form.locationStatus = data.locationStatus;
  }
}
