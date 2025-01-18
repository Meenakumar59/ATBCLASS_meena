package May.EX_25052024.wrapper_class.ENUM.API_ENDPOINTS;

public class Lab_155 {
    public static void main(String[] args) {
              APIENDPOINTS E = APIENDPOINTS.LOGIN;
              switch (E){
                  case LOGIN -> System.out.println("Login successfully");
                  case DASHBOARD -> System.out.println("landed on dashboard");
              }
    }
}
