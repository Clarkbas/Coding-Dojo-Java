package Telefonos;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("iPhone " + getVersionNumber()+ " - " + getBatteryPercentage()+ " % de Bateria "  + " - " + getCarrier());
    }
    
    @Override
    public String ring() {
        return "iPhone " + getVersionNumber() + " esta sonando con " + getRingTone();
    }
    
    @Override
    public String unlock() {
        return "Desbloquear iPhone " + getVersionNumber();
    }
}

