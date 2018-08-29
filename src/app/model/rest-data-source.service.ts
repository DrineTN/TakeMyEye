import { Injectable } from '@angular/core';
import { HttpClient, HttpEvent, HttpRequest} from '@angular/common/http';
import { Place } from './place.model';
import {Observable} from 'rxjs'; 
const PROTOCOL = "http";
const PORT = 8080;
@Injectable({
  providedIn: 'root'
})
export class RestDataSourceService {
  private base_url: string;
  private headers = new Headers({'Content-type': 'application/json'});
  constructor(private http:HttpClient) {
    this.base_url = `${PROTOCOL}://${location.hostname}:${PORT}/`
   }
   getPlaces():Observable<Place[]> {
     return this.http.get<Place[]>(this.base_url + 'photos');
   }
   pushFileToStorage(place : Place):Observable<Place> {
     return this.http.post<Place>(this.base_url + 'photos',place);
    }
}
