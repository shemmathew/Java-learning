package src.basics_oops_10_jan13.Abstraction.realtimeexample;

public class TC1_CHROME extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("Starting CHROME");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing CHROME");
        return null;
    }
}
