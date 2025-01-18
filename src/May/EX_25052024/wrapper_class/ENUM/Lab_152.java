package May.EX_25052024.wrapper_class.ENUM;

public class Lab_152 {
    public static void main(String[] args) {
        HTTPSTATUSCODE status = HTTPSTATUSCODE.OK;
        System.out.println(status.getCode() + " " + status.getMessage());

    }
    enum HTTPSTATUSCODE{
        OK(200,"success"),
        CREATED(201,"created"),
        Accepted(201,"Accepted");

        int code;
        String message;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        HTTPSTATUSCODE(int code, String message) {
            this.code = code;
            this.message = message;
        }
    }
}
