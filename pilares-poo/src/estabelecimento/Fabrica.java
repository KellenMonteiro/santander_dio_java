package estabelecimento;

import equipamentos.equipamentos.digitalizadora.Digitalizadora;
import equipamentos.equipamentos.impressora.Deskjet;
import equipamentos.equipamentos.impressora.Impressora;
import equipamentos.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Deskjet deskjet = new Deskjet();
        
        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = em;
        

        impressora.imprimir();
        digitalizadora.digitalizar();
        
    }
}