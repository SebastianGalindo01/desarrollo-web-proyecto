import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.scss']
})
export class DepartmentComponent implements OnInit {
  departamentList = [
    {
      name : "Cundinamarca",
      id: 1
    },
    {
      name : "Antioquia",
      id : 2
    },
    {
      name : "Boyaca",
      id : 3
    },
    {
      name : "Santander",
      id : 4
    },
    {
      name : "Caldas",
      id : 5
    }
  ]
  showEdit = 0
  constructor() { }

  ngOnInit(): void {
  }

  addElement(name:string): void {
    this.departamentList.push({
      name: name,
      id: (Math.random() * 2) / (Math.random() * 5)
    })
  }

  removeElement(id:number): void {
    this.departamentList  = this.departamentList.filter(item => item.id !== id);
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
    let index = this.departamentList.indexOf(item);
    item.name = newName;
    this.departamentList[index] = item;
  }
}
