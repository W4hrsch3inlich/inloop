public class PercentageDiscountPricing implements ISalePricing{
    private double percentage;

    public PercentageDiscountPricing(double percentage) {
        if(!(0 <= percentage && percentage <= 100)) {
            throw new IllegalArgumentException("Discount Percentage must be between 0 and 100.");
        }
        this.percentage = percentage;
    }

    public long getTotal(Sale sale) {
        return Double.valueOf(sale.getPreDiscountTotal() * (1.0 - percentage / 100.0)).longValue();
    }
}
