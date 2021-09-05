package contants;

public enum SteamUrls {
    BASE_URL("https://store.steampowered.com/");

    private String url;

    SteamUrls(String url) {
        this.url = url;
    }

    public String getBaseUrl() {
        return url;
    }

}
