public class SimpleCalculator {
    private double firstNumber;
    private double secondNUmber;


    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNUmber() {
        return secondNUmber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNUmber(double secondNUmber) {
        this.secondNUmber = secondNUmber;
    }

    public double GetAdditionResult(){
        return firstNumber+secondNUmber;
    }

    public double GetSubtractionResult(){
        return firstNumber-secondNUmber;
    }

    public double GetMultiplicationResult(){
        return firstNumber * secondNUmber;
    }

    public double GetDivisonResult(){
        if(secondNUmber==0 || firstNumber==0){
            return 0;
        }
        return firstNumber / secondNUmber;
    }
}
