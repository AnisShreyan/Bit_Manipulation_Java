public class Main {
    public static void main(String[] args) {
        //System.out.println("Bit Manipulation");

        //Get Bit
        //First make bit mask (left shift of 1) and then do AND operation with original number
        //If the result is 0 then the value is 0 if 1 then 1

        int pos = 2; //From right to left (starting from 0)
        int num = 5; //0101

        int bitMask = 1 << pos;

        if ((bitMask & num) == 0){
            System.out.println("the value at "+ pos + " no. position = 0");
        }
        else {
            System.out.println("the value at "+ pos + " no. position = 1");
        }

        //Set Bit
        //First make bit mask (left shift of 1) and then do OR operation with original number
        //The result will be the set value
        int setBitValue = bitMask | num; //0101

        System.out.println(setBitValue);
    }
}