class A{
    int x;
    A(int x){
        this.x = x;
    }
    public void printA(){
        System.out.println(x);
    }
}
class B extends A{
    int x;
    B(int x){
        super(x);
        this.x = x;
    }
    public void printB(){
        System.out.println(x);
    }
}
class C extends A{
    C(int x){
        super(x);
        this.x = x;
    }
    public void printC(){
        System.out.println(x);
    }
}
class Hierarchical{
    public static void main(String args[]){
        C c = new C(10);
        c.printC();
        //c.printB();
        c.printA();
    }
}