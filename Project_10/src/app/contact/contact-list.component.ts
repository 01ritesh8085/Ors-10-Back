import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-contact-list',
  templateUrl: './contact-list.component.html',
  styleUrls: ['./contact-list.component.css']
})
export class ContactListComponent extends BaseListCtl {

 constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
     super(locator.endpoints.CONTACT, locator, route);
   }
}
