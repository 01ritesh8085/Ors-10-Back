import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-location-list',
  templateUrl: './location-list.component.html',
  styleUrls: ['./location-list.component.css']
})
export class LocationListComponent extends BaseListCtl{

   constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {

      super(locator.endpoints.LOCATION, locator, route);
    }

}
