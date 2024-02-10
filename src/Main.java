public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        simpleCalculator.setFirstNumber(10);//first number sayı verdik
        simpleCalculator.setSecondNUmber(0);//second number sayı verdik
        System.out.println("add = "+simpleCalculator.GetAdditionResult());//topladı
        System.out.println("Add = "+simpleCalculator.GetSubtractionResult());
        System.out.println("Add = "+simpleCalculator.GetMultiplicationResult());
        System.out.println("Add = "+simpleCalculator.GetDivisonResult());
    }
}
