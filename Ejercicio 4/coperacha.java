public class coperacha {
    public static void main(String[] args) {
        vaquita debe1 = new vaquita();
        debe1.caireles(10, "Pedro");
        vaquita debe2 = new vaquita();
        debe2.caireles(12, "Claudia");
        vaquita debe3 = new vaquita();
        debe3.caireles(9, "Cinthya");
        vaquita debe4 = new vaquita();
        debe4.caireles(8, "Alejandra");
        vaquita debe5 = new vaquita();
        debe5.caireles(7, "Edwin");
        vaquita debe6 = new vaquita();
        debe6.caireles(15, "Paulina");
        vaquita debe7 = new vaquita();
        debe7.caireles(11, "Brenda");
        vaquita debe8 = new vaquita();
        debe8.caireles(30, "Jorge");
        sumame costo = new sumame();
	costo.total(10, 12, 9, 8, 7, 15, 11, 30);
	System.out.println("Total: "+costo.valor+ " $");
    }    
}