package Exam.Pricing;
import java.util.List;
import java.util.LinkedList;

public class ComplexPricing implements ISalePricing{
    private List<ISalePricing> pricings;

    public ComplexPricing(ISalePricing pricing) {
        this.add(pricing);
    }

    public void add(ISalePricing pricing) {
        pricings.add(pricing);
    }

    public List<ISalePricing> getPricings() {
        return pricings;
    }
}
