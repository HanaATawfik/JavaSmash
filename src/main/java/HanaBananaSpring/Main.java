package HanaBananaSpring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component //steryotype annotation
class Banana{   //banana class (listing 2.3)
    private String name;
    public Banana(){
        System.out.println("Banana is created"); // seen only once when bean is created
    }
    public void setName(String name) { //setter
        this.name = name;
    }
    public String getName() {//getter
        return name;
    }
}
@Component
class Person{
    private String name;
    private Banana banana;
    public void setName(String name) { //setter
        this.name = name;
    }
    public String getName() {//getter
        return name;
    }
    public void setbanana(Banana banana) {
        //setter
        this.banana = banana;
    }
    public Banana getbanana() { //getter
        return banana;
    }

}

public class Main {
    public static void main(String[] args) {
     var context = new AnnotationConfigApplicationContext(ProjectConfig.class); //instance of spring  context (listing 2.6)

     //String salute=context.getBean(String.class);
    // System.out.println(salute); //print hello world (listing 2.12)
     Banana bananaz = context.getBean("banana",Banana.class); //get bean from context (listing 2.9)
     Person humanz = context.getBean(Person.class); //getbean from context (listing 2.9)
        System.out.println(humanz.getName()); //print banana name (listing 2.10)
        System.out.println(bananaz.getName()); //print banana name (listing 2.10)
    }
}