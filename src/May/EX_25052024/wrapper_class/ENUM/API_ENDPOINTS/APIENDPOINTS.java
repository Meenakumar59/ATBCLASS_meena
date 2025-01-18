package May.EX_25052024.wrapper_class.ENUM.API_ENDPOINTS;

public enum APIENDPOINTS {
    LOGIN("https:vwo.com.login","home page"),
    HOME("https:vwo.com.home","HOme page"),
    DASHBOARD("https:vwo.com.dashboard","dashboard page"),
    ;
    //enum- list of constants url -  private int code;
    //    private String
    int page1;
    String Url;
    String page;

    APIENDPOINTS(String url, String page) {
        Url = url;
        this.page = page;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
