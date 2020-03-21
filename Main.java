public class Main {

    public static void main(String[] args) {

        System.out.println("Zadanie 1:");
        Materac m1 = new Materac();

        m1.setKolor("Niebieski");
        m1.setWagaKg(72);
        m1.setSprezynowy(true);

        System.out.println("Materac m1 ma kolor " + m1.getKolor() + ", waży " + m1.getWagaKg() + " kg, i posiada " + m1.isSprezynowy() + " spręży(y).");

        System.out.println();

        System.out.println("Zadanie 2:");

        Materac m2 = new Materac("Niebieski", 72, true);
        Materac m3 = new Materac();

        System.out.println("m1 == m2: " + m1.equals(m2));
        System.out.println("m1 == m3: " + (m1 == m3));

        System.out.println();

        System.out.println("m1: " + m1.hashCode());
        System.out.println("m2: " + m2.hashCode());
        System.out.println("m3: " + m3.hashCode());

        System.out.println();

        System.out.println("m1: " + m1);
        System.out.println("m1: " + m2);
        System.out.println("m1: " + m3);
    }
}
