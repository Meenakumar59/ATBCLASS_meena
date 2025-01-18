package May.EX_18052024.Acces_modifier.police;

public class JrCop {
    public static void main(String[] args) {
        cop c = new cop(10);
        System.out.println(cop.gun);
        c.canIShoot();
    }
}
