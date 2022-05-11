package Pricing;

public class PercentageDiscountPricing implements ISalePricing{
    private double percentage;

    public PercentageDiscountPricing(double percentage) {
        if(!(0 <= percentage && percentage <= 100)) {
            throw new IllegalArgumentException("Discount Percentage must be between 0 and 100.");
        }
        this.percentage = percentage;
    }

    public long getTotal(Sale sale) {
        return sale.getPreDiscountTotal() * (1 - Double.valueOf(percentage).longValue() / 100);
    }
}
