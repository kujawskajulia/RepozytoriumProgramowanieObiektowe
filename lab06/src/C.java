public class C implements A, B {
    @Override
    public void hello() {
        A.super.hello();
    }
}