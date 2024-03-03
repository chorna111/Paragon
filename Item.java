public class Item{
    private String name;
    private int price_netto;
    private int vat;
    public Item(String name,int price_netto,int vat){
        this.name=name;
        this.price_netto=price_netto;
        this.vat=vat;

    }
    public float calculate_brutto_price(){
        return price_netto*(1+vat/100);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice_neto() {
        return price_netto;
    }
    public void setPrice_neto(int price_neto) {
        this.price_netto = price_neto;
    }
    public int getVat() {
        return vat;
    }
    public void setVat(int vat) {
        if(vat==23|vat==8){

            this.vat = vat;
        }else{
            System.out.println("The VAT rate should be 23% or 8%");
        }
    }
    
}