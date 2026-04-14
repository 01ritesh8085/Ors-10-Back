import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent extends BaseCtl{

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
          super(locator.endpoints.REVIEW, locator, route);
        }
  
   onUpload(userform: FormData) {
      this.submit();
      console.log(this.form.data.id + '---- after submit');
  
    }
  
    validateForm(form) {
      let flag = true;
      let validator = this.serviceLocator.dataValidator;
      flag = flag && validator.isNotNullObject(form.reviewName);
      flag = flag && validator.isNotNullObject(form.rating);
      flag = flag && validator.isNotNullObject(form.reviewText);
      flag = flag && validator.isNotNullObject(form.reviewDate);
  
      return flag;
    }
  
    populateForm(form, data) {
      form.id = data.id;
      form.reviewName = data.reviewName;
      form.rating = data.rating;
      form.reviewText = data.reviewText;
      form.reviewDate = data.reviewDate;
    }
}
