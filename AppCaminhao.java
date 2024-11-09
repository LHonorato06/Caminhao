package herança;
import java.util.ArrayList;
public class AppCaminhao {
    public static void main(String[] args) {
        ArrayList<caminhaoBau> ListaCaminhaoBau = new ArrayList();
        ArrayList<caminhaotanque>ListaCaminhaoTanque = new ArrayList();
        caminhaoBau caminhaoBau1 = new caminhaoBau("volvo 123",2020,2000,'T',10,2.20,3.50);
        caminhaoBau caminhaoBau2 = new caminhaoBau("WV Turbo",2021,1800,'T',12,2.20,3.50);
        caminhaoBau caminhaoBau3 = new caminhaoBau("WV T1000",2022,2200,'T',14,2.20,3.8);
        ListaCaminhaoBau.add(caminhaoBau1);
        ListaCaminhaoBau.add(caminhaoBau2);
        ListaCaminhaoBau.add(caminhaoBau3);

        caminhaotanque caminhaotanque1 = new caminhaotanque("Iveco Day",2019,3000,'L',"Água");
        caminhaotanque caminhaotanque2 = new caminhaotanque("MB 2000",2021,2500,'L',"Combustível");
        ListaCaminhaoTanque.add(caminhaotanque1);
        ListaCaminhaoTanque.add(caminhaotanque2);
        System.out.println(ListaCaminhaoBau);

    }

}
