public class vaquita {
    public double iva = .16;
    public double propina = .10;
    
    public void caireles(double precio, String nombre){
        double total = precio*(1+iva+propina);
        System.out.println(nombre + " caireles con: " +total+" $");
    }
}