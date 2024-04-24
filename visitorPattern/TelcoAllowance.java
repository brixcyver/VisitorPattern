class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money) {
        double allowance;
        switch (telcoName) {
            case "Smart":
                allowance = 15.0;
                break;
            case "Globe":
                allowance = 10.0;
                break;
            case "Ditto":
                allowance = 8.0;
                break;
            default:
                allowance = 0.0;
        }
        return "Data Allowance for " + telcoName + ": " + allowance + "GB for $" + money;
    }
}
