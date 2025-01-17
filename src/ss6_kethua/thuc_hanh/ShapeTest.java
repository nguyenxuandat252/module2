package ss6_kethua.thuc_hanh;

public class ShapeTest {

    public static void main(String[] args) {
        SystemOfGeometricObjects systemOfGeometricObjects = new SystemOfGeometricObjects();
        System.out.println(systemOfGeometricObjects);

        systemOfGeometricObjects = new SystemOfGeometricObjects("red", false);
        System.out.println(systemOfGeometricObjects);
    }

}
