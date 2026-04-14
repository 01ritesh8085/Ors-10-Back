import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-complaint',
  templateUrl: './complaint.component.html'
})
export class ComplaintComponent extends BaseCtl {

  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.COMPLAINT, locator, route);
  }

  validateForm(form) {
    let v = this.serviceLocator.dataValidator;
    return v.isNotNullObject(form.complaintTicketId)
      && v.isNotNullObject(form.issueType)
      && v.isNotNullObject(form.createdDate)
      && v.isNotNullObject(form.status);
  }

  populateForm(form, data) {
    form.id = data.id;
    form.complaintTicketId = data.complaintTicketId;
    form.issueType = data.issueType;
    form.createdDate = data.createdDate;
    form.status = data.status;
  }
}