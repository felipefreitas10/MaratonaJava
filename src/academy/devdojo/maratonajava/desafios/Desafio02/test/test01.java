package academy.devdojo.maratonajava.desafios.Desafio02.test;

import academy.devdojo.maratonajava.desafios.Desafio02.domain.ItenCart;
import academy.devdojo.maratonajava.desafios.Desafio02.domain.CartShop;
import academy.devdojo.maratonajava.desafios.Desafio02.domain.Product;


public class test01 {
    public static void main(String[] args){
        Product product01 = new Product("Nike Shoes", 55.5, 200);
        Product product02 = new Product("Adidas Shoes", 45, 250);
        Product product03 = new Product("Puma Shoes", 42, 250);
        Product product04 = new Product("New Balace Shoes", 50, 180);
        Product product05 = new Product("Converse Shoes", 35, 100);

        ItenCart itenCart01 = new ItenCart(product01, 1);
        ItenCart itenCart02 = new ItenCart(product02, 2);
        ItenCart itenCart03 = new ItenCart(product03, 1);
        ItenCart itenCart04 = new ItenCart(product04, 1);
        ItenCart itenCart05 = new ItenCart(product05, 1);


        CartShop cartShop = new CartShop();


        cartShop.addIten(itenCart01);//1
        cartShop.addIten(itenCart02);//2
        cartShop.addIten(itenCart03);//3
        cartShop.addIten(itenCart04);//4
        cartShop.addIten(itenCart05);//5
        cartShop.addIten(itenCart01);//6
        cartShop.addIten(itenCart02);//7
        cartShop.addIten(itenCart03);//8
        cartShop.addIten(itenCart04);//9
        cartShop.addIten(itenCart05);//10
        cartShop.addIten(itenCart01);//11




        ItenCart[] itensCart = cartShop.getItens();

        for (ItenCart itenCart : itensCart) {
            if (itenCart != null) {
                System.out.println(itenCart.getProduct().getName());
            }
        }


        double valueSale = cartShop.calculateSale();

        if(valueSale == 0){
            System.out.println("First add item in the little car");
        }else{
            System.out.println("The purchase amout is " + valueSale);
        }


        cartShop.finishSale(); // finish the sale
        System.out.println(product02.getStockQuantity());



    }
}
