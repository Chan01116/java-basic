package day8.accessModifer;

public class Person{
    // private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
    private int id;
    public void setId(int id){
        this.id = id;

    }
    public int getId(int id){
        return id;

    }


}
