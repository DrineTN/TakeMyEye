import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import 'hammerjs';
import {MatCardModule} from '@angular/material/card';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { HomeComponent } from './main/home/home.component';
import { PlacesComponent } from './main/places/places.component';
import { FooterComponent } from './main/footer/footer.component';
import { NavComponent } from './main/nav/nav.component';
import { RouterModule , Routes } from "@angular/router";
import { FormsModule } from '../../node_modules/@angular/forms';
import { RestDataSourceService } from './model/rest-data-source.service';
import { PlaceRepositoryService } from './model/place-repository.service';
import { PlaceDetailsComponent } from './places/place-details/place-details.component';
const routes : Routes = [
  {
    path: '',
    component : PlacesComponent,
  },
  {
    path : 'place',
    component : PlaceDetailsComponent,
  }
]
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PlacesComponent,
    FooterComponent,
    NavComponent,
    PlaceDetailsComponent
  ],
  imports: [
    BrowserModule ,
    MatCardModule,
    RouterModule.forRoot(routes),
    FormsModule,
    HttpClientModule
  ],
  providers: [RestDataSourceService,PlaceRepositoryService],
  bootstrap: [AppComponent]
})
export class AppModule { }
