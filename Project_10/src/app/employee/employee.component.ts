import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent extends BaseCtl {

  constructor(public localor: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
    super(localor.endpoints.EMPLOYEE, localor, route);
  }

 validate() {
    return this.validateForm(this.form.data);
  }
}
