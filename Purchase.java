import java.util.ArrayList;
import java.util.List;


public class Purchase{
    public  List<Item> list_of_items=new ArrayList<>();
    private float suma_netto_vat8;
    private float suma_netto_vat23;
    private float taxes_8;
    private float taxes_23;
    private float price_brutto;

    public Purchase(List<Item> list_of_items){
        this.list_of_items=list_of_items;
    }
    public void calculate_netto(){
        for(Item item:list_of_items){
            if(item.getVat()==8){
                suma_netto_vat8+=item.getPrice_neto();
            }else{
                suma_netto_vat23+=item.getPrice_neto();
            }
        }
    }
    public void calculate_taxes(){
        taxes_8=suma_netto_vat8*8/100;
        taxes_23=suma_netto_vat23*23/100;
    }
    public void calculate_brutto(){
        price_brutto=suma_netto_vat23+suma_netto_vat8+taxes_23+taxes_8;
    }   

    @Override
    public String toString(){
        String sep=("|"+"-".repeat(20)).repeat(3)+"|";
        String out="|"+" ".repeat(20)+
        "|Łączna wartość netto| Obliczony  podatek |\n"+sep
        +"\n"+String.format("|VAT 8%%              |%20.2f|%20.2f|\n",suma_netto_vat8,taxes_8)+
        sep+
        "\n"+String.format("|VAT 23%%             |%20.2f|%20.2f|\n",suma_netto_vat23,taxes_23)+sep+
        "\n Łączna wartość paragonu: "+price_brutto+" zł";
        return out;
        


    }

}


