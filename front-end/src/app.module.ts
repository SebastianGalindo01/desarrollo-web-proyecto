import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HeaderComponent, CardCityComponent } from './shared';
import { DepartmentComponent } from './department/department.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { ReportComponent } from './report/report.component';
import { TownComponent } from './town/town.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    DepartmentComponent,
    HomeComponent,
    CardCityComponent,
    RegisterComponent,
    ReportComponent,
    TownComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot([
      { path: '', component: HomeComponent },
      { path: 'departamento', component: DepartmentComponent },
      { path: 'registro', component: RegisterComponent },
      { path: 'reporte', component: ReportComponent },
      { path: 'municipio', component: TownComponent },
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
