import java.math.BigDecimal;
public class CalculateTax
{

    public static void main(String[] args)
    {

        BigDecimal netPrice = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.23");

        BigDecimal grossPrice = netPrice.multiply(
                BigDecimal.ONE.add(vatRate)
        );

        System.out.println("Gross price (BigDecimal): " + grossPrice);

        BigDecimal totalGross = grossPrice.multiply(new BigDecimal("10000"));
        System.out.println("Total gross for 10,000 products: " + totalGross);

        BigDecimal totalNet = totalGross.divide(
                BigDecimal.ONE.add(vatRate)
        );

        System.out.println("Net value recalculated: " + totalNet);
    }

}