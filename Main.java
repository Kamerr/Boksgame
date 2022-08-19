public class Main {
    public static void main(String[] args) {
        Fighter Leyla = new Fighter("Leyla" , 15 , 100, 90, 50);
        Fighter Mecnun = new Fighter("Mecnun" , 10 , 95, 100, 50);
        Ring r = new Ring(Leyla,Mecnun , 90 , 100);
        r.run();
    }
}