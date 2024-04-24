class UnliCallTextPackage implements UnliCallTextOffer {
    @Override
    public String showUnliCallTextOffer(String telcoName, boolean unliCallText) {
        return "Unlimited Calls and Texts " + (unliCallText ? "Available" : "Not Available") + " for " + telcoName;
    }
}