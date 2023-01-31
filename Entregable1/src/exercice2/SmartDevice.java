package exercice2;

public class SmartDevice {
	String marca;
	String modelo;
	String color;
	
	public SmartDevice() {
		// TODO Auto-generated constructor stub
	}
	public SmartDevice(String marca, String modelo, String color){
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
	}
}

class SmartPhone  extends SmartDevice{
	double ram;
	double procesador;
	
	public SmartPhone(String marca, String modelo, String color, double ram, double procesador) {
		super(marca,modelo,color);
		this.ram=ram;
		this.procesador=procesador;
	}
	public SmartPhone (){
		super();
		
	}
	@Override
	public String toString() {
		return "SmartPhone [marca=" +marca + ", modelo=" + modelo +",color=" +color+",ram=" + ram + ", procesador=" + procesador + "]";
	}
	
	
	
}

class SmartWatch  extends SmartDevice{
	double version;
	double precio;
	
	public SmartWatch (String marca, String modelo, String color, double version, double precio) {
		super(marca,modelo,color);
		this.version=version;
		this.precio=precio;
	}
	public SmartWatch (){
		super();
	}
	@Override
	public String toString() {
		return "SmartWatch [marca=" +marca + ", modelo=" + modelo +",color=" +color+",  version=" + version + ", precio=" + precio + "]";
	}
	
	
	
	
}
