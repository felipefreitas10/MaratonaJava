package academy.devdojo.maratonajava.desafios.Associations.Challenge02.domain;

public class ItenCart {
    private Product product; //1:1
    private int quantityOrdered;

    public ItenCart(Product product, int quantityOrdered) {
        this.product = product;
        this.quantityOrdered = quantityOrdered;
    }

    public double subTotal(){
        return this.quantityOrdered * this.product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }
}
