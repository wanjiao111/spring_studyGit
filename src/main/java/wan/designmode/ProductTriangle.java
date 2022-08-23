package wan.designmode;

public class ProductTriangle implements Product{

    @Override
    public void draw() {
        System.out.println("画三角形");
    }
    public void erase(){
        System.out.println("擦掉三角形");
    }
}
