package src.com.sibsutis.devices;

import src.com.sibsutis.Printable;
import java.util.Objects;

public abstract class Device implements Printable {
    protected int device;
    protected int price;
    protected String ip;

    public Device(int id, int price, String ip) {
        this.device = id;
        this.price = price;
        this.ip = ip;
    }

    public abstract String getDeviceType();

    @Override
    public String sprint() {
        return "Device{id=" + device + ", price=" + price + ", ip='" + ip + "', type='" + getDeviceType() + "'}";
    }

    public int split() { return this.price; }
    public int getDevice() { return device; }
    public int getPrice() { return price; }
    public String getIp() { return ip; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device1 = (Device) o;
        return device == device1.device && price == device1.price && Objects.equals(ip, device1.ip);
    }

    @Override
    public int hashCode() { return Objects.hash(device, price, ip); }
}