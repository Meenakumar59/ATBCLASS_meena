package RA;

public class builderPattern {
    public  builderPattern gf(){
        System.out.println("do task gf");
        return this;
        //why using same name as class name?
        //it reurns itseld eeg. gf employees give to ff
        //returning the same instance
        //this - refers calling current object
    }
    public builderPattern ff(String name){
        System.out.println("do task ff");
        return this;
    }
    public builderPattern sf(String name, String color){
        System.out.println("do task sf");
        return this;
    }

    public static void main(String[] args) {
        builderPattern bp = new builderPattern();
        bp.ff("MEENA").sf("ANU", "WHITE");
        //DOT OPERATOR
    }
}
