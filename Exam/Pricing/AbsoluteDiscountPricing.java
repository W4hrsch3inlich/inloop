public class AbsoluteDiscountPricing implements ISalePricing{
    private long discount;
    private long threshold;

    public AbsoluteDiscountPricing(long discount, long threshold) {
        this.discount = discount;
        this.threshold = threshold;
    }

    public long getTotal(Sale sale) {
        /*
        if(sale.getPreDiscountTotal() < threshold) {
            throw new IllegalArgumentException("Catalog price is below the threshold.");
        }
        */
        return Math.max(sale.getPreDiscountTotal() - discount, threshold);
    }
}
