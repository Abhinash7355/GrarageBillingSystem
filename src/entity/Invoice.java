package entity;

public class Invoice {
    public int id;
    public int customerId;
    public int vehicleId;
    public int serviceId;
    public String date;

    public Invoice(int id, int customerId, int vehicleId, int serviceId) {
        this.id = id;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.serviceId = serviceId;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }


    @Override
    public String toString() {
        return "Invoice [id=" + id + ", customerId=" + customerId + ", vehicleId=" + vehicleId + ", serviceId=" + serviceId +"]";
    }
}
