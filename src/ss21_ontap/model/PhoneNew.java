package ss21_ontap.model;

public class PhoneNew  extends Phone{
    private String warranty;
    private String warrantyScope;

    public PhoneNew() {
    }

    public PhoneNew(String code, int id, String trademark, String name, double price, String warrantyScope, String warranty) {
        super(code, id, trademark, name, price);
        this.warrantyScope = warrantyScope;
        this.warranty = warranty;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getWarrantyScope() {
        return warrantyScope;
    }

    public void setWarrantyScope(String warrantyScope) {
        this.warrantyScope = warrantyScope;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "warranty='" + warranty + '\'' +
                ", warrantyScope='" + warrantyScope + '\'' +
                '}';
    }
    public String getInfoData(){
        return this.getCode()+","+this.getId()+","+
                this.getTrademark()+","+this.getName()+","+
                this.getPrice()+","+this.getWarranty()+","+
                this.getWarrantyScope();
    }
}
