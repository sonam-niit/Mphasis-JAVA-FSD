import { Pipe, PipeTransform } from "@angular/core";

@Pipe({name:'changeString'})
export class CustomPipe implements PipeTransform
{
    transform(value: string, character:string) {
        return value.split(character).join("-");
    }

}