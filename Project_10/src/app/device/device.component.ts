import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-device',
  templateUrl: './device.component.html',
  styleUrls: ['./device.component.css']
})
export class DeviceComponent  extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.DEVICE, locator, route);
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.deviceSerialNumber);
    flag = flag && validator.isNotNullObject(form.deviceName);
    flag = flag && validator.isNotNullObject(form.deviceType);
    flag = flag && validator.isNotNullObject(form.operatingSystem);
    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.deviceSerialNumber = data.deviceSerialNumber;
    form.deviceName = data.deviceName;
    form.deviceType = data.deviceType;
    form.operatingSystem = data.operatingSystem;
  }

}
