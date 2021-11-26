import { Component, OnInit, Input } from '@angular/core';


@Component({
  selector: 'app-card-city',
  templateUrl: './card-city.component.html',
  styleUrls: ['./card-city.component.scss']
})


export class CardCityComponent implements OnInit {
  hero = "asds";
  master = 'Master';
  @Input() cityName = 't'
  

  constructor(
  ) {}

  ngOnInit() {}
}