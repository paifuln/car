package src.com.sibsutis.devices;

import java.util.Objects;

public class Phone extends Device {
    
    public Phone(int id, int price) {
        super(id, price, null);
    }
    
    public Phone(int id, int price, String ip) {
        super(id, price, ip);
    }
    
    @Override
    public String getDeviceType() {
        return "Phone";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Phone phone = (Phone) o;
        return Objects.equals(getDeviceType(), phone.getDeviceType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDeviceType());
    }
}