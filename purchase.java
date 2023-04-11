public class Purchase {
    private String invoiceNumber;
    private double saleAmount;
    private double salesTax;

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
        this.salesTax = saleAmount * 0.05;
    }

    public void display() {
        System.out.println("Invoice number: " + invoiceNumber);
        System.out.println("Sale amount: $" + saleAmount);
        System.out.println("Sales tax: $" + salesTax);
    }
}

//You can create an instance of the Purchase class and call its methods like this:

// Purchase purchase = new Purchase();
// purchase.setInvoiceNumber("INV001");
// purchase.setSaleAmount(1000.0);
// purchase.display();
