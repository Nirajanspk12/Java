package AbcShopSystem;

public class Supplier extends Person{

    private double companyName;
    private SupplierStatus supplierStatus;

    private String supplier_address;

    public Supplier() {
        this.companyName=123.0;
        this.supplierStatus= SupplierStatus.ACTIVE;
        this.supplier_address="anamnager";
    }

    public Supplier(double companyName, SupplierStatus supplierStatus, String supplier_address) {
        this.companyName = companyName;
        this.supplierStatus = supplierStatus;
        this.supplier_address = supplier_address;
    }

    public double getCompanyName() {
        return companyName;
    }

    public void setCompanyName(double companyName) {
        this.companyName = companyName;
    }

    public SupplierStatus getSupplierStatus() {
        return supplierStatus;
    }

    public void setSupplierStatus(SupplierStatus supplierStatus) {
        this.supplierStatus = supplierStatus;
    }

    public String getSupplier_address() {
        return supplier_address;
    }

    public void setSupplier_address(String supplier_address) {
        this.supplier_address = supplier_address;
    }


    @Override
    public String toString() {
        return "Supplier{" +
                "companyName=" + companyName +
                ", supplierStatus='" + supplierStatus + '\'' +
                ", supplier_address='" + supplier_address + '\'' +
                '}';
    }

    public void setDiscount() {
        switch (supplierStatus) {
            case PAST:
                this.discount = 0.05;  // 5% discount for past suppliers
                break;
            case FUTURE:
                this.discount = 0.1;   // 10% discount for future suppliers
                break;
            case ACTIVE:
                this.discount = 0.15;  // 15% discount for active suppliers
                break;
            default:
                this.discount = 0.0;   // default discount if status is not recognized
        }
    }

}
