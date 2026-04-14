import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-inquiry',
  templateUrl: './inquiry.component.html',
  styleUrls: ['./inquiry.component.css']
})
export class InquiryComponent extends BaseCtl{

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
      super(locator.endpoints.INQUIRY, locator, route);
    }

    onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.inquiryName);
    flag = flag && validator.isNotNullObject(form.email);
    flag = flag && validator.isNotNullObject(form.inquirySubject);
    flag = flag && validator.isNotNullObject(form.inquiryStatus);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.inquiryName = data.inquiryName;
    form.email = data.email;
    form.inquirySubject = data.inquirySubject;
    form.inquiryStatus = data.inquiryStatus;
  }
}