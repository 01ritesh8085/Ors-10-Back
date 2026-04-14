import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html'
})
export class FeedbackComponent extends BaseCtl implements OnInit {

  ratingList: any = {};
  objectKeys = Object.keys;

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.FEEDBACK, locator, route);
  }

  ngOnInit() {
    this.preload();
  }

  // PRELOAD METHOD
  preload() {
    this.locator.httpService.get('Feedback/preload').subscribe((res: any) => {
      console.log("PRELOAD RESPONSE:", res);

      if (res.success) {
        this.ratingList = res.result.ratingList;
      }
    });
  }

  validateForm(form) {
    let v = this.locator.dataValidator;
    return v.isNotNullObject(form.feedbackFormId)
      && v.isNotNullObject(form.participantName)
      && v.isNotNullObject(form.rating)
      && v.isNotNullObject(form.comments);
  }

  populateForm(form, data) {
    form.id = data.id;
    form.feedbackFormId = data.feedbackFormId;
    form.participantName = data.participantName;
    form.rating = data.rating;
    form.comments = data.comments;
  }
}