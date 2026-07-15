package academy.devdojo.maratonajava.desafios.Desafio02.domain;

public class itenCart {
    private Product product; //1:1
    private int quantityOrdered;

    public itenCart(Product product, int quantityOrdered) {
        this.product = product;
        this.quantityOrdered = quantityOrdered;
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
