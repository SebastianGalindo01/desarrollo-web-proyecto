import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-report',
  templateUrl: './report.component.html',
  styleUrls: ['./report.component.scss']
})
export class ReportComponent implements OnInit {

  activeTab : "country" | "city" = "country"

  countryList = [
    {
      name : "Cundinamarca",
      report: 48
    },
    {
      name : "Antioquia",
      report: 35
    },
    {
      name : "Boyaca",
      report: 24
    },
    {
      name : "Santander",
      report: 52
    },
    {
      name : "Caldas",
      report: 12
    },
    {
      name : "Antlantico",
      report: 42
    }
  ]

  cityList = [
    {
      name : "Bogotá",
      report: 24
    },
    {
      name : "Medellin",
      report: 81
    },
    {
      name : "Bucaramanga",
      report: 147
    },
    {
      name : "Manizales",
      report: 150
    },
    {
      name : "Tunja",
      report: 200
    },
    {
      name : "Cartagena",
      report: 215
    }
  ]


  constructor() { }

  ngOnInit(): void {
  }

  handleActiveTab(tab:"country" | "city") {
    this.activeTab = tab
  }
}
