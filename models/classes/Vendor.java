package UTSS.models.classes;

public class Vendor {
    private String vendorName, serviceType;
    private double vendorFee;

    public Vendor(String vendorName, String serviceType, double vendorFee) {
        this.vendorName = vendorName;
        this.serviceType = serviceType;
        this.vendorFee = vendorFee;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getServiceTime() {
        return serviceType;
    }

    public void setServiceTime(String serviceType) {
        this.serviceType = serviceType;
    }

    public double getVendorFee() {
        return vendorFee;
    }

    public void setVendorFee(double vendorFee) {
        this.vendorFee = vendorFee;
    }

    public String getVendorDetail(){
        return "nama vendor :  " + this.vendorName + 
        "\nService type : " + this.serviceType + 
        "\nHarga Vendor : " + this.vendorFee; 
    }

}
