package academy.devdojo.maratonajava.desafios.Associations.Challenge02.domain;

public class CartShop {
    private ItenCart[] itens = new ItenCart[10]; //só pode 10 itens no carrinho

    public boolean validation(ItenCart iten){
        if(iten.getQuantityOrdered() > iten.getProduct().getStockQuantity()){
            return false;
        }
        return true;
    }
    public double calculateSale(){
        double sum = 0;
        for(ItenCart iten : this.itens){
            if(iten != null){
                sum += iten.subTotal();
            }
        }
        return sum;
    }

    public void finishSale(){
        int newQtd;
        for(ItenCart iten : this.itens){
            if(iten!=null){
                newQtd = iten.getProduct().getStockQuantity() - iten.getQuantityOrdered();
                iten.getProduct().setStockQuantity(newQtd);
            }
        }
    }

    public void addIten(ItenCart iten){
        int contador = 0;
        if(validation(iten)){
            for(int i = 0; i < this.itens.length; i++){
                if(this.itens[i] == null){
                    this.itens[i] = iten;
                    break;
                }
            }

            for(ItenCart itenn : this.itens){
                if(itenn != null){
                    contador++;
                }
            }

            if(contador==9){
                System.out.println("The little car is full! Make a purchase or remove an item.");
            }

        }else{
            System.out.println("The " + iten.getProduct().getName() + " is out of stock!");
        }
    }

    //get and set
    public ItenCart[] getItens() {
        return itens;
    }

    public void setItens(ItenCart... itens) {
        this.itens = itens;
    }
}
