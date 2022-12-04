public class MainApp {
    public static void main(String[] args) throws Exception{
        Perangkat Perangkat0 = new Perangkat("Seagate", 8, (float) (2.40));
        Perangkat0.informasi();
        System.out.println();

        Laptop Laptop1 = new Laptop("Seagate", 8, (float) (2.40), true);
        Laptop1.informasi();
        Laptop1.bukaGame("Dota 2");
        Laptop1.kirimEmail("laille.@gmail.com");
        Laptop1.kirimEmail("nanfz.@gmail.com", "fane.@gmail.com");
        System.out.println();

        Handphone Handphone1 = new Handphone("Sandisk", 3, (float) (2.20), false);
        Handphone1.informasi();
        Handphone1.telfon(62897499);
        Handphone1.kirimSMS(653397512);
        Handphone1.kirimSMS(613244805, 692111711);

    }
}
