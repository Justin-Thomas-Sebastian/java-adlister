package dao;

public class adsDaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao(){
        if(adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }
}
