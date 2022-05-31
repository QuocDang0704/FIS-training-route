public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo("abc", "abc");
        //Foo foo1 = foo.clone();


    }
}
class Foo implements Cloneable{
    private String value;
    private String key;

    public Foo() {
    }

    public Foo(String value, String key) {
        this.value = value;
        this.key = key;
    }
}
