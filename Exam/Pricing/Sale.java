enum DiscountType {PERCENTAGEDISCOUNT, ABSOLUTEDISCOUNT}

public class Sale {
    private long preDiscountTotal;
    private ISalePricing pricing;

    public Sale(long preDiscountTotal, ISalePricing pricing) {
        this.preDiscountTotal = preDiscountTotal;
        this.pricing = pricing;
    }

    public long getPreDiscountTotal() {
        return preDiscountTotal;
    }

    public void setPricing(ISalePricing pricing) {
        this.pricing = pricing;
    }

    public long getTotal() {
        return pricing.getTotal(this);
    }

    public static ISalePricing createPricing(DiscountType discountType, double percentage, long discount, long threshold) {
        if(discountType == DiscountType.PERCENTAGEDISCOUNT) {
            return new PercentageDiscountPricing(percentage);
        }
        return new AbsoluteDiscountPricing(discount, threshold);
    }
}