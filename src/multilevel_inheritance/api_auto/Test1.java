package multilevel_inheritance.api_auto;

public class Test1 extends Base_Test{
    void accesexcelandsql(){
        openexcelfile();
        openSQLconnection();
        System.out.println(sql_version);
        System.out.println(excel_version1);
        System.out.println();
    }
}
