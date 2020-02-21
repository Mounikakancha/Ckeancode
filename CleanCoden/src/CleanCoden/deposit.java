package CleanCoden;

import CleanCoden.SimpleInterest;

public class deposit implements SimpleInterest, CompoundInterest {
    private Double principleAmount;
    private Integer timeInterval;
    private Double rateOfInterest;


    deposit(Double principleAmount, Integer timeInterval, Double rateOfInterest){
        this.principleAmount = principleAmount;
        this.timeInterval = timeInterval;
        this.rateOfInterest = rateOfInterest;
    }


    public Double comPoundInterest() {
        return principleAmount * Math.pow(( 1 + rateOfInterest/100 ), timeInterval );
    }

    public Double simpleInterest() {
        return (principleAmount * timeInterval * rateOfInterest)/100;
    }
}