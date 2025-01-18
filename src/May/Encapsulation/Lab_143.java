package May.Encapsulation;

public class Lab_143 {
    public static void main(String[] args) {
          vwologin v = new vwologin("admin","admin123");
          //String password= v.getPassword(false);
         String usernmae= v.getUsername();
         String password = v.setPassword("meena",true);
        // v.setPassword("meena",true);
        System.out.println(password);
    }
}
class vwologin {
    private String username;
    private String password;

    public vwologin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAuth) {
        if (isAuth) {
            return password;
        }
        return "not allowed";
    }

    public String setPassword(String password, boolean isAuth) {
        if (isAuth) {
            this.password = password;
        } else {
            System.out.println("not allowed");
        }
        return password;
    }
}

