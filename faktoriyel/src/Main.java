public class Main {
    public static void main(String[] args) {
        int sayi = 7;
        int faktoriyel = 1;
        for(int i = 1; i <= sayi; i++){
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!= " + faktoriyel);
    }
}