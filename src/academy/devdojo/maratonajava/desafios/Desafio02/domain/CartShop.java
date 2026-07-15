package academy.devdojo.maratonajava.desafios.Desafio02.domain;

public class CartShop {
    private itenCart[] itens = new itenCart[10]; //só pode 10 itens no carrinho

    public CartShop(itenCart... itens) {
        this.itens = itens;
    }

    public void validation(){

    }
    public void calculateSale(){

    }
    public void finishSale(){

    }
    public void addIten(Product product, int qtd){
        for(int i = 0; i < qtd; i++){
            itens[i].setProduct(product);
            itens[i].setQuantityOrdered(qtd);
        }

    }


    public itenCart[] getItens() {
        return itens;
    }

    public void setItens(itenCart... itens) {
        this.itens = itens;
    }
}
