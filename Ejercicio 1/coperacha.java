public class coperacha {
	public static void main(String[] args) {
		double impuestos = 0.05;
		double propina = 0.15;
		double persona1 = 10;
		double persona2 = 12;
		double persona3 = 9;
		double persona4 = 8;
		double persona5 = 7;
		double persona6 = 15;
		double persona7 = 11;
		double persona8 = 30;
		System.out.println("Persona 1: "+((persona1*propina)+(persona1*impuestos)+ persona1)+ "$");
		System.out.println("Persona 2: "+((persona2*propina)+(persona2*impuestos)+ persona2)+ "$");
		System.out.println("Persona 3: "+((persona3*propina)+(persona3*impuestos)+ persona3)+ "$");
		System.out.println("Persona 4: "+((persona4*propina)+(persona4*impuestos)+ persona4)+ "$");
		System.out.println("Persona 5: "+((persona5*propina)+(persona5*impuestos)+ persona5)+ "$");
		System.out.println("Persona 6: "+((persona6*propina)+(persona6*impuestos)+ persona6)+ "$");
		System.out.println("Persona 7: "+((persona7*propina)+(persona7*impuestos)+ persona7)+ "$");
		System.out.println("Persona 8: "+((persona8*propina)+(persona8*impuestos)+ persona8)+ "$");
	}
}