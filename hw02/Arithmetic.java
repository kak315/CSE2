// Kathryn Kundrod
// February 2, 2015
// CSE 2
// hw02

// Arithmetic computes cost with sales tax

public class Arithmetic {
    public static void main (String[] args) {
        
        // input variables
        int nSocks=3; //Number of pairs of socks
        double sockCost$=2.58; //Cost per pair of socks
        
        int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29; //Cost per glass
        
        int nEnvelopes=1; //Number of boxes of envelopes
        double envelopeCost$=3.25; //Cost per box
        
        double taxPercent=0.06; //Sales tax rate
        
        // calculate costs and sales tax for each item
        double totalSockCost$;
        double sockTax$;
        double totalGlassCost$;
        double glassTax$;
        double totalEnvelopeCost$;
        double envelopeTax$;
        
        totalSockCost$=nSocks*sockCost$*100; //multiply by 100: first step to convert into price form
        int totalSockCostInt$=(int) totalSockCost$; //change to int: second step to convert into price form
        double totalSockCostTrue$=totalSockCostInt$/100.0; //divide by 100.0: third step to convert into price form
        sockTax$=totalSockCostTrue$*taxPercent*100;
        int sockTaxInt$=(int) sockTax$;
        double sockTaxTrue$=sockTaxInt$/100.0;
        
        totalGlassCost$=nGlasses*glassCost$*100;
        int totalGlassCostInt$=(int) totalGlassCost$;
        double totalGlassCostTrue$=totalGlassCostInt$/100.0;
        glassTax$=totalGlassCostTrue$*taxPercent*100;
        int glassTaxInt$=(int) glassTax$;
        double glassTaxTrue$=glassTaxInt$/100.0;
        
        totalEnvelopeCost$=nEnvelopes*envelopeCost$*100;
        int totalEnvelopeCostInt$=(int) totalEnvelopeCost$;
        double totalEnvelopeCostTrue$=totalEnvelopeCostInt$/100.0;
        envelopeTax$=totalEnvelopeCostTrue$*taxPercent*100;
        int envelopeTaxInt$=(int) envelopeTax$;
        double envelopeTaxTrue$=envelopeTaxInt$/100.0;
        
        double totalBeforeTax$=totalSockCostTrue$+totalGlassCostTrue$+totalEnvelopeCostTrue$;
        double totalTax$=sockTaxTrue$+glassTaxTrue$+envelopeTaxTrue$;
        double totalAfterTax$=totalBeforeTax$+totalTax$;
        
        System.out.println("The number of socks bought was "+nSocks+
            " at a price of $"+sockCost$+" each.");
        System.out.println("The number of glasses bought was "+nGlasses+
            " at a price of $"+glassCost$+" each.");
        System.out.println("The number of envelopes bought was "+nEnvelopes+
            " at a price of $"+envelopeCost$+" each.");
        System.out.println("Total cost of socks was $"+totalSockCostTrue$+
            ", and the sales tax on the socks was $"+sockTaxTrue$+".");
        System.out.println("Total cost of glasses was $"+totalGlassCostTrue$+
            ", and the sales tax on the glasses was $"+glassTaxTrue$+".");
        System.out.println("Total cost of envelopes was $"+totalEnvelopeCostTrue$+
            ", and the sales tax on the socks was $"+envelopeTaxTrue$+".");
        System.out.println("Total cost of purchases before tax was $"
            +totalBeforeTax$+", and the sales tax was $"+totalTax$+".");
        System.out.println("Total paid for this transaction with sales tax was $"
            +totalAfterTax$+".");

    }
}