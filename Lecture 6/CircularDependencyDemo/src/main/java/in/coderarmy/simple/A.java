package in.coderarmy.simple;

public class A {
    private B b;

    public A(){
        System.out.println("A Created");
        this.b = new B();
    }
}
