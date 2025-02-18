package ss12_setmap.bai_tap.bai_1.model;

public class Product {
    private Integer productCode;
    private String productName;

    public Product() {
    }

    public Product(Integer productCode, String productName) {
        this.productCode = productCode;
        this.productName = productName;
    }

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                '}';
    }
}
