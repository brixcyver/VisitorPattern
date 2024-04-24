class Telco implements TelcoSubscription {
    private String telcoName;
    private String promoPrice;
    private int dateAllowance;
    private boolean unliCallText;

    public Telco(int dateAllowance, String promoPrice, String telcoName, boolean unliCallText) {
        this.dateAllowance = dateAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public String getPromoPrice() {
        return promoPrice;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallTextOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallTextOffer(telcoName, unliCallText);
    }
}
