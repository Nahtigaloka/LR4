package javalr4;
        
public class PersonEntity {
    protected int id;
    protected String name;
    protected String gen;
    protected SubdivisionEntity subdiv;
    protected int Salary;
    protected String DoB;
    public PersonEntity(){
        this.id=0;
        this.name="";
        this.gen="";
        this.subdiv=new SubdivisionEntity();
        this.Salary=0;
        this.DoB="";
    }
    public void InputID(int id){
        this.id=id;
    }
    public void InputName(String Name){
        this.name=Name;
    }
    public void InputGen(String Name){
        this.gen=Name;
    }
    public void InputSubdiver(String name){
        this.subdiv.InputSubdiv( name);
    }
    public void InputSalary(int salary){
        this.Salary=salary;
    }
    public void InputDoB(String dob){
        this.DoB=dob;
    }
}
