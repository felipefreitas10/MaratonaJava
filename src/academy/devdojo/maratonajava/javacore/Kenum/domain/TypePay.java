package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TypePay {
    //override of method

    //Therefore, the method will exhibit behavior different for each enum
    DEBITO{
        @Override
        public double discount(int value) {
            return value * 0.1;
        }
    }, CREDITO{
        @Override
        public  double discount(int value){
            return value * 0.05;
        }
    };

    public double discount(int value){
        return 0;
    }
}
