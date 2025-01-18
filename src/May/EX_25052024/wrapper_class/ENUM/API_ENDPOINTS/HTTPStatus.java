package May.EX_25052024.wrapper_class.ENUM.API_ENDPOINTS;

public class HTTPStatus {
    public static void main(String[] args) {
        HTTPStatuscode status = HTTPStatuscode.CREATED;
        System.out.println(status.getCode() + " - " + status.getMessage());
    }

}
enum HTTPStatuscode{
    OK(200,"OK"),
    CREATED(201, "CREATED");
    private Integer code;
    private String message;
    HTTPStatuscode(int code, String message) {
        this.code = code;
        this.message = message;
    }

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
}
