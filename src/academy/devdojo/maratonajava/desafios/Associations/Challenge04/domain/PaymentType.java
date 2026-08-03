package academy.devdojo.maratonajava.desafios.Associations.Challenge04.domain;

public enum PaymentType {
    TICKET(2, 0){
        @Override
        public double calculateFinalValue(double originValue) {
            return originValue + PROCESSING_FREE;
        }
    },
    CREDIT(0.035, 0){
        @Override
        public double calculateFinalValue(double originValue){
            return originValue + originValue*PROCESSING_FREE;
        }
    },
    PIX(0, 0.05){
        @Override
        public double calculateFinalValue(double originValue){
            return originValue - originValue*DISCOUNT;
        }
    };

    public final double PROCESSING_FREE;
    public final double DISCOUNT;

    PaymentType(double processingFree, double discount){
        PROCESSING_FREE = processingFree;
        DISCOUNT = discount;
    }

    public abstract double calculateFinalValue(double originValue);
}
