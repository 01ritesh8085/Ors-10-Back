import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-setting',
  templateUrl: './setting.component.html',
  styleUrls: ['./setting.component.css']
})
export class SettingComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.SETTING, locator, route);
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.settingName);
    flag = flag && validator.isNotNullObject(form.settingValue);
    flag = flag && validator.isNotNullObject(form.settingType);
    flag = flag && validator.isNotNullObject(form.settingStatus);

    return flag;
  }

   populateForm(form, data) {
    form.id = data.id;
    form.settingName = data.settingName;
    form.settingValue = data.settingValue;
    form.settingType = data.settingType;
    form.settingStatus = data.settingStatus;
  }
}
