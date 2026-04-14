import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-language',
  templateUrl: './language.component.html'
})
export class LanguageComponent extends BaseCtl {

  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.LANGUAGE, locator, route);
  }

  validateForm(form) {
    let v = this.serviceLocator.dataValidator;
    return v.isNotNullObject(form.languageCode)
      && v.isNotNullObject(form.languageName)
      && v.isNotNullObject(form.region)
      && v.isNotNullObject(form.status);
  }

  populateForm(form, data) {
    form.id = data.id;
    form.languageCode = data.languageCode;
    form.languageName = data.languageName;
    form.region = data.region;
    form.status = data.status;
  }
}