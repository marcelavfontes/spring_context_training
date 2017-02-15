package myPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainClass {

    private ProgrammaticController controller;
    private ProgrammaticController alternativeController;

    @Autowired
    public MainClass(
            @Qualifier("programmaticController") ProgrammaticController controller,
            @Qualifier("programmaticAlternativeController") ProgrammaticController alternativeController) {
        this.controller = controller;
        this.alternativeController = alternativeController;
    }

    public static void main(String args []){
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        MainClass mainClass = context.getBean(MainClass.class);
        mainClass.run();
    }

    public void run(){
        controller.printText("oii!!!");
        alternativeController.printText("tchau!!");
    }

}
