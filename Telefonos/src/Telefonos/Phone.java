package Telefonos;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.setVersionNumber(versionNumber);
        this.setBatteryPercentage(batteryPercentage);
        this.setCarrier(carrier);
        this.setRingTone(ringTone);
    }
    // Método abstracto. Este método será implementado por las subclases
    public abstract void displayInfo();
    // getters y setters removidos para resumir. Por favor implementarlos por usted mismo.
	public String getVersionNumber() {
		return versionNumber;
	}
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getRingTone() {
		return ringTone;
	}
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
}


