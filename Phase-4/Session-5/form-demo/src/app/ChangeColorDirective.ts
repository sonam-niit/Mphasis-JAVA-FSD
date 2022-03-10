import { Directive, ElementRef } from "@angular/core";

@Directive({
    selector:'[changeColor]'
})
export class ChangeColorDirective
{
    constructor(er:ElementRef)
    {
        er.nativeElement.style.color="green";
    }
}