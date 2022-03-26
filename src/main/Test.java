package main;

public class Test {
    public static void main(String[] args) {
//        System.out.println("The minimum number of notes used are "+JUnitTestingPrograms.minNoOfNotes(2673));
//        System.out.println("The day of the week is "+JUnitTestingPrograms.dayOfWeek(10,6,1998));
//          System.out.println(JUnitTestingPrograms.tempConversion(32));
        System.out.println(JUnitTestingPrograms.monthlyPayment(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2])));
    }
}
