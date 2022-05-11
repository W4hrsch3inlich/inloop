package Exam.Pricing;

public class BestForStorePricing extends ComplexPricing{
    public BestForCustomerPricing(ISalePricing pricing) {
        this.add(pricing);
    }

    @Override
    public long getTotal(Sale sale) {
        long maxTotal = Long.MIN_VALUE;
        for(ISalePricing pricing : getPricings()) {
            if(pricing.getTotal(sale) > minTotal) {
                maxTotal = pricing.getTotal(sale);
            }
        }
        return maxTotal;
    }
}
