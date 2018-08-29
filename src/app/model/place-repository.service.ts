import { Injectable } from '@angular/core';
import { Place } from './place.model';
import { RestDataSourceService } from './rest-data-source.service';

@Injectable({
  providedIn: 'root'
})
export class PlaceRepositoryService {
  private places:Place[]= [];
  constructor(
    private dataSource:RestDataSourceService
  ) { 
    dataSource.getPlaces().subscribe(data =>
    {
      this.places = data,
     console.log(this.places)
    }
    )
  }
  getPlaces(): Place[] {
    return this.places;
  }
  pushImage(place:Place){
    this.dataSource.pushFileToStorage(place);
  }
}
