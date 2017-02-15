package myPackage;

public class ProgrammaticController {

    private ProgrammaticService programmaticService;

    public ProgrammaticController(ProgrammaticService programmaticService) {
        this.programmaticService = programmaticService;
    }

    public void printText(String text) {
        programmaticService.printText(text);
    }
}
