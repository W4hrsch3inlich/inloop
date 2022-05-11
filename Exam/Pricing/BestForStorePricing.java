package Pricing;

public class BestForStorePricing extends ComplexPricing{
    public BestForStorePricing(ISalePricing pricing) {
        super(pricing);
    }

    @Override
    public long getTotal(Sale sale) {
        long maxTotal = Long.MIN_VALUE;
        for(ISalePricing pricing : getPricings()) {
            if(pricing.getTotal(sale) > maxTotal) {
                maxTotal = pricing.getTotal(sale);
            }
        }
        return maxTotal;
    }
}
