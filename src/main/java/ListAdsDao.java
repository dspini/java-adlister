import java.util.ArrayList;

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    public Long insert(Ad ad) {
        if (ads == null) {
            ads = generateAds();
        }

        ad.setId((long) ads.size());
        ads.add(ad);
        return ad.getId();
    }
    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                1,
                "for sale",
                "1 item"
        ));
        ads.add(new Ad(
                2,
                1,
                "wanted",
                "1 item"
        ));
        ads.add(new Ad(
                3,
                2,
                "help wanted",
                "1 position"
        ));
        ads.add(new Ad(
                4,
                2,
                "for rent",
                "1 apartment"
        ));
        return ads;
    }
}
