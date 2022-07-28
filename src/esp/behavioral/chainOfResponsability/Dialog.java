package esp.behavioral.chainOfResponsability;

public class Dialog extends Container {

  private String wikiPageURL;

  public Dialog(String wikiPageURL) {
    this.wikiPageURL = wikiPageURL;
  }

  @Override
  public void showHelp() {
    if(wikiPageURL!=null){
      System.out.println(wikiPageURL);
    }else{
      super.showHelp();
    }
  }

  public String getWikiPageURL() {
    return wikiPageURL;
  }

  public void setWikiPageURL(String wikiPageURL) {
    this.wikiPageURL = wikiPageURL;
  }
}
