package collections.ArrayList;


class Generic <T,G>{
    T value;
    G point;
    public Generic(T value,G point ){
       this.value = value;
       this.point = point;
    }
    public void display(){
        System.out.println(" the value is "+this.value + " "+this.point);
    }
}
