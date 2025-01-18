package May.EX_18052024.Encapsulation;

public class Lab_142 {
    public void main(String[] args) {
        vwologin v = new vwologin("admin123","admin");
//        private String username = v.getUsername();
//        private String password= v.getPassword();

    }
    static class vwologin{
        private String username;
        private String password;

        public vwologin(String password, String username) {
            this.password = password;
            this.username = username;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }


}
