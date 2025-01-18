package May.EX_18052024.Acces_modifier.police;

public class cop {
    public static int gun;//access by anyone
    private String id;// only availble to the cop


    public  cop(int gun) {//parametrise cop
        this.gun=gun;

    }
    protected void canIShoot(){
        System.out.println("of course - you can shoot!");
    }
}
