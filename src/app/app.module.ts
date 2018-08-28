import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import 'hammerjs';
import {MatCardModule} from '@angular/material/card';

import { AppComponent } from './app.component';
import { HomeComponent } from './main/home/home.component';
import { PlacesComponent } from './main/places/places.component';
import { FooterComponent } from './main/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PlacesComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule ,
    MatCardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
