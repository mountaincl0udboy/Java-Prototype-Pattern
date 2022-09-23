import java.util.ArrayList;
import java.util.List;
public class Employees implements Cloneable{
    List<String> emp;
    Employees() {
        emp = new ArrayList<>();
    }
    Employees(List<String> emp){
        this.emp = emp;
    }
    void loaddata(){
        emp.add("Kamila");
        emp.add("Jordan");
        emp.add("Enigma");
        emp.add("Tarzan");
    }
    List<String> getEmpList(){
        return emp;
    }
    @Override
    protected Object clone()throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s: this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }
}