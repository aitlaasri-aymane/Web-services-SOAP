import proxy.BankService;
import proxy.BankWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BankService stub = new BankWS().getBankServicePort();
        System.out.println(stub.conversion(100));
        Compte cp =stub.getCompte(1);
        System.out.println("Compte "+cp.getCode()+"=> Solde : "+cp.getSolde());
        System.out.println("--------List Comptes---------");
        List<Compte> comptes = stub.comptes();
        comptes.forEach(compte -> {
            System.out.println("Compte "+compte.getCode()+"=> Solde : "+compte.getSolde());
        });
    }
}
