package myPackage;

import org.springframework.stereotype.Service;

@Service
public class PlanningServiceImpl implements PlanningService {
    @Override
    public void save(String plan) {
        System.out.println(plan);
    }

}
