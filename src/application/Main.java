package application;

import model.entities.Departament;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Departament dp = new Departament(123, "Financeiro");

        Seller sl = new Seller(123,"Pedro", "pedro@gmail.com", new Date(), 20000.0, dp);
        System.out.println(dp);
        System.out.println(sl);
    }
}