package javalr4;

public class SubdivisionEntity {
    protected int ID;
    protected String Name;
    protected SubdivisionEntity(){
        this.Name="0";
        this.ID=0;
    }
    public SubdivisionEntity(int id,String name){
        this.Name=name;
        this.ID=id;
    }
    public void InputSubdiv(String name){
        this.Name=name;
        this.ID=(int)(name.charAt(0));
    }
}
