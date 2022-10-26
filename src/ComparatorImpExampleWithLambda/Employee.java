package ComparatorImpExampleWithLambda;

public  class Employee  {
    public int no;
    public String name;

    public Employee(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return no;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Employee e= (Employee) obj;
        if(no != e.no){
            return false;
        }
        return true;
    }
}
