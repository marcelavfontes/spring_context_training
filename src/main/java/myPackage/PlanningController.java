package myPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlanningController {

    private PlanningService service;

    @Autowired
    public PlanningController(PlanningService service) {
        this.service = service;
    }

    public void printPlan(){
        this.service.save("plan");
    }
}
