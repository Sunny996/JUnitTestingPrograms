package main;

public class Binary {
    public static void nibbleSwap(int num){
        int newNum=0,count=0;
        String binary="",newBinary="";
        binary=JUnitTestingPrograms.toBinary(num);
        newBinary=binary.substring(4,8)+binary.substring(0,4);
        for(int i=0;i<newBinary.length();i++){
            if(newBinary.charAt(i)=='1'){
                newNum+=Math.pow(2,newBinary.length()-i-1);
                count++;
            }
        }
        if(count==1)
            System.out.println("The new number is "+ newNum+ " and it is a power of 2");
        else
            System.out.println("The new number is "+ newNum+ " and it is not a power of 2");
    }
}
