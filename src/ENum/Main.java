package ENum;
 enum Laptop{
    hP(900), lenovo(200), Thinkbook(4244), thinkPad(900);
     public int getPrice() {
         return price;
     }
     public void setPrice(int price) {
         this.price = price;
     }
     private int price;
     Laptop(int price) {
     this.price = price;
     }
 }
public class Main {
public static void main(String[]args){
    for(Laptop laptop :Laptop.values()){
        System.out.println(" laptop "+ laptop + " "+laptop.getPrice());
    };
    Laptop.Thinkbook.setPrice(500);
    Laptop.thinkPad.setPrice(700);
    System.out.println("\n");
    for(Laptop c2 : Laptop.values()){
        System.out.println(c2 + "  "+c2.getPrice());
    }
}
 }
