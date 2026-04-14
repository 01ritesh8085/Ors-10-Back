import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent extends BaseCtl{

   constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
      super(locator.endpoints.CONTACT, locator, route);
    }
  
    onUpload(userform: FormData) {
      this.submit();
      console.log(this.form.data.id + '---- after submit');
  
    }
  
    validateForm(form) {
      let flag = true;
      let validator = this.serviceLocator.dataValidator;
      flag = flag && validator.isNotNullObject(form.name);
      flag = flag && validator.isNotNullObject(form.email);
      flag = flag && validator.isNotNullObject(form.mobileNo);
      flag = flag && validator.isNotNullObject(form.message);
  
      return flag;
    }
  
    populateForm(form, data) {
      form.id = data.id;
      form.name = data.name;
      form.email = data.email;
      form.mobileNo = data.mobileNo;
      form.message = data.message;
    }
}
