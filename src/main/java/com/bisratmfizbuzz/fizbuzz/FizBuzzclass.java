package com.bisratmfizbuzz.fizbuzz;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizBuzzclass
{
    private String FizBuzzDispaly ;
    @RequestMapping
    public String calculater ()
    {

       int count;
        for(count = 0; count <= 99 ;count++){
            if (count % 3 ==0 && count % 5 == 0){
                FizBuzzDispaly += String.valueOf(count) + "<br/>";
                System.out.println(count +  "-" + "FizzBuzz");
            }

            else if  (count % 3 == 0  ){
                FizBuzzDispaly += String.valueOf(count) + "<br/>";
                System.out.println(count + "-" +  "Fizz");
            }

            else if (count % 5 == 0){
                FizBuzzDispaly += String.valueOf(count) + "<br/>";
                System.out.println(count + "-" + "Buzz");
            }
            else {
                FizBuzzDispaly += String.valueOf(count) + "<br/";
                System.out.println(count);
            }
            }
            System.out.println(100);
        FizBuzzDispaly += String.valueOf(count);

        return  FizBuzzDispaly ;
    }

}
