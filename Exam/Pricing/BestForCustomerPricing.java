package Exam.Pricing;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class BestForCustomerPricing extends ComplexPricing{
    public BestForCustomerPricing(ISalePricing pricing) {
        this.add(pricing);
    }

    @Override
    public long getTotal(Sale sale) {
        long minTotal = Long.MAX_VALUE;
        for(ISalePricing pricing : getPricings()) {
            if(pricing.getTotal(sale) < minTotal) {
                minTotal = pricing.getTotal(sale);
            }
        }
        return minTotal;
    }
}
