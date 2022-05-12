public class AbsoluteDiscountPricing implements ISalePricing{
    private long discount;
    private long threshold;

    public AbsoluteDiscountPricing(long discount, long threshold) {
        if(discount < 0) throw new IllegalArgumentException("Discount cant be negative.");
        if(threshold < 0) throw new IllegalArgumentException("Threshold cant be negative.");
        this.discount = discount;
        this.threshold = threshold;
    }

    public long getTotal(Sale sale) {
        /*
        if(sale.getPreDiscountTotal() < threshold) {
            throw new IllegalArgumentException("Catalog price is below the threshold.");
        }
        */
        if(sale.getPreDiscountTotal() < threshold) return sale.getPreDiscountTotal();

        return Math.max(sale.getPreDiscountTotal() - discount, threshold);
    }
}
