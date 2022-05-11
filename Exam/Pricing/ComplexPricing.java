package Pricing;
import java.util.List;
import java.util.LinkedList;

public abstract class ComplexPricing implements ISalePricing{
    private List<ISalePricing> pricings;

    public ComplexPricing(ISalePricing pricing) {
        pricings = new LinkedList<ISalePricing>();
        add(pricing);
    }

    public void add(ISalePricing pricing) {
        pricings.add(pricing);
    }

    public List<ISalePricing> getPricings() {
        return pricings;
    }
}
