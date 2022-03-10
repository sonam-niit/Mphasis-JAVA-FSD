import { Directive, ElementRef, Renderer2 } from "@angular/core";

@Directive({selector:'[highlight]'})
export class HighlightDirective
{
    constructor(er:ElementRef,render:Renderer2)
    {
        render.setStyle(er.nativeElement,'background-color','aqua')
    }
}