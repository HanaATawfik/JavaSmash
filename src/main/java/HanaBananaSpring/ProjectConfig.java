package HanaBananaSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "HanaBananaSpring") //scan package for components
public class ProjectConfig {  //spring config class 2.7
    @Bean //bean name is method name aka banana
    //@Primary
    Banana banana(){ //factory method  from Banana class in main 2.8
       var bananaz=new Banana(); //new object of Banana class
       bananaz.setName("PURPLE BANANA");
       return bananaz;
  }

   @Bean //bean name is method name aka banana
  Banana banana1(){ //factory method  from Banana class in main 2.8
     var bananaz=new Banana(); //new object of Banana class
        bananaz.setName("jackie");
        return bananaz;
   }


    @Bean //bean name is method name aka banana
    Banana banana2(){ //factory method  from Banana class in main 2.8
        var bananaz=new Banana(); //new object of Banana class
        bananaz.setName("rash");
        return bananaz;
    }

    @Bean //bean name is method name aka banana
        //@Primary
    Person human(@Qualifier("banana1") Banana banana){ //factory method  from Banana class in main 2.8
        var human=new Person(); //new object of Banana class
        human.setName("Hana");
        // human.setbanana(banana());  //inject banana bean into person bean
        human.setbanana(banana);  //inject banana bean into person bean
        return human;
    }

   // @Bean
   // String hello(){
     //   return "Hello World!";
  //  }
}