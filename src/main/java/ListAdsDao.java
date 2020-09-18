import java.util.ArrayList;
import java.util.List;

public class ListAdsDao<Ads, Ad> extends Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    public Long insert(Ad ad) {
        // make sure we have ads
        if (ads == null) {
            ads = generateAds();
        }
        // we'll assign an "id" here based on the size of the ads list
        // really the dao would handle this
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
                "1 apt"
        ));
        return ads;
    }
}
