package Ex_19_oops_part2.superkeyword;

public class Lab180 {

}
class Baseclass {
    private String Browser;

    public Baseclass(String browser) {
        this.Browser = Browser;
    }

    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser, boolean isadmin) {
        if (isadmin) {
            this.Browser = browser;
        }else{
            System.out.println("Change browser Not allowed, Not a Admin");
        }

    }
    void openBrowser() {
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }

    void bhk3(){}
}
  class tc extends Baseclass{
    public void tc(){
        System.out.println("tc prinbt");
    }

      public tc(String Browser){

         super(Browser);
         super.openBrowser();
         super.openBrowser();
         super.bhk3();
         super.closeBrowser();
         this.tc();
      }



  }


