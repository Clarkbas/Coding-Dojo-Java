package Telefonos;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + getVersionNumber()+ " - " + getBatteryPercentage()+ " % de Bateria " + " - " + getCarrier());
    }
    
    @Override
    public String ring() {
        return "Galaxy " + getVersionNumber() + " esta sonando con " + getRingTone();
    }
    
    @Override
    public String unlock() {
        return "Desbloquear Galaxy " + getVersionNumber();
    }
}

