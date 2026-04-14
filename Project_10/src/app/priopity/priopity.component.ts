import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-priopity',
  templateUrl: './priopity.component.html',
  styleUrls: ['./priopity.component.css']
})
export class PriopityComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.PRIORITY, locator, route);
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.priorityCode);
    flag = flag && validator.isNotNullObject(form.priorityLevel);
    flag = flag && validator.isNotNullObject(form.colorTag);
    flag = flag && validator.isNotNullObject(form.priorityStatus);
    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.priorityCode = data.priorityCode;
    form.priorityLevel = data.priorityLevel;
    form.colorTag = data.colorTag;
    form.priorityStatus = data.priorityStatus;
  }
}
