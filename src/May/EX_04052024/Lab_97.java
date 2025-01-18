package May.EX_04052024;

public class Lab_97 {
    public static void main(String[] args) {
        String name = "meena";//SCP
        String mame1 = new String("meena");//OA
//    String are immutable in nature -- cant be change
        StringBuffer stringBuffer= new StringBuffer("meenaa");
        stringBuffer.append("meena");

        StringBuilder stringBuilder =new StringBuilder("meena");
        stringBuilder.append("meena");

//Buffer and bulider are mutable in nature -- can be change
//                but there are difference
//                Buffer ---> thread safe
//                Builder ---> not thread safe
//                which mean thread safe can be access one by one but for not thread safe is all
//        can be access at a time

        String pw = "pw@123";
        pw = "123";///2 string in SCP - string constant pool

        StringBuilder paw = new StringBuilder("pw");
         paw.append("1234"); /// 1 string in HA - not thread safe so paw value be changed
        System.out.println(paw);
    }



}
