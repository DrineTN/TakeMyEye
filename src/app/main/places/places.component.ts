import { Component, OnInit } from '@angular/core';
import { PlaceRepositoryService } from '../../model/place-repository.service';
import { Place } from '../../model/place.model';

@Component({
  selector: 'app-places',
  templateUrl: './places.component.html',
  styleUrls: ['./places.component.css']
})
export class PlacesComponent implements OnInit {
  place : Place = new Place();
  selectedFiles : FileList;
  currentFileUpload: File;
  constructor(private placeRepo: PlaceRepositoryService) { }

  ngOnInit() { 
  }
   get places(): Place[] {
    return this.placeRepo.getPlaces();
  }
  onFileChange(event) {
    const file = event.target.files.item(0);
    if (file.type.match('image.*')) {
      this.selectedFiles = event.target.files;
      this.place.image_path = event.file;
      this.place.caption ='qsqsd';
      this.place.image_size = 150;
      this.place.user_id =2;
    } else {
      alert('invalid format');
    }
  }
  onUpload() {
    this.currentFileUpload = this.selectedFiles.item(0)
    this.placeRepo.pushImage(this.place);
  }
}
