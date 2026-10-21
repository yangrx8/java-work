package cn.weiguang;

public class QueryRequest {
    private String trackingNumber;
    private String phone;

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "QueryRequest{" +
                "trackingNumber='" + trackingNumber + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
