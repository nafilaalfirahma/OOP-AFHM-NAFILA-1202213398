public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("### Pergerakan Transportasi Air ###\n");;

        TransportasiAir Trans1 = new TransportasiAir(4, 20000);
        Trans1.informasi();
        Trans1.berlayar();
        Trans1.berlabuh();
        System.out.println();

        Sampan Sampan1 = new Sampan(20, 50000, 2);
        Sampan1.informasi();
        Sampan1.berlayar();
        Sampan1.berlabuh();
        Sampan1.berlabuh(2);
        System.out.println();

        Kapal Kapal1 = new Kapal(50, 100000, "Diesel");
        Kapal1.informasi();
        Kapal1.berlayar();
        Kapal1.berlayar(20);
        Kapal1.berlabuh();
    }
}
