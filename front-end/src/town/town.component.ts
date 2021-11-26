import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-town',
  templateUrl: './town.component.html',
  styleUrls: ['./town.component.scss']
})
export class TownComponent implements OnInit {
  townList = [
    {
      name : "Bogotá",
      id: 1
    },
    {
      name : "Medellin",
      id : 2
    },
    {
      name : "Bucaramanga",
      id : 3
    },
    {
      name : "Tunja",
      id : 4
    },
    {
      name : "Manizales",
      id : 5
    }
  ]
  showEdit = 0
  constructor() { }

  ngOnInit(): void {
  }

  addElement(name:string): void {
    this.townList.push({
      name: name,
      id: (Math.random() * 2) / (Math.random() * 5)
    })
  }

  removeElement(id:number): void {
    this.townList  = this.townList.filter(item => item.id !== id);
  }

  addCityInput() : void {
    console.log("hola")
  }

  handleShowEdit(id:number) : void {
    this.showEdit = id
  }

  handleHiddenEdit() : void {
    this.showEdit = 0
  }
  updateItem(item:any, newName:string){
    let index = this.townList.indexOf(item);
    item.name = newName;
    this.townList[index] = item;
  }
}
