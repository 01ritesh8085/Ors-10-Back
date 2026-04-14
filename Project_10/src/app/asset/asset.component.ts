import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-asset',
  templateUrl: './asset.component.html',
  styleUrls: ['./asset.component.css']
})
export class AssetComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.ASSET, locator, route);
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.assetCode);
    flag = flag && validator.isNotNullObject(form.assetName);
    flag = flag && validator.isNotNullObject(form.assignedTo);
    flag = flag && validator.isNotNullObject(form.issueDate);
    flag = flag && validator.isNotNullObject(form.assetStatus);
    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.assetCode = data.assetCode;
    form.assetName = data.assetName;
    form.assignedTo = data.assignedTo;
    form.issueDate = data.issueDate;
    form.assetStatus = data.assetStatus;
  }
}