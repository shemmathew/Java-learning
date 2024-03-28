package src.basics_oops_10_jan13.Abstraction.realtimeexample;

public class TC2_FIREFOX extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("Starting FIREFOX");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing FF");
        return null;
    }
}
