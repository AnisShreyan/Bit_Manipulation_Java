public class Main {
    public static void main(String[] args) {
        //System.out.println("Bit Manipulation");

        //Get Bit
        //First make bit mask and then do and operation with original number
        //If the result is 0 then the value is 0 if 1 then 1

        int pos = 1; //From right to left (starting from 0)
        int num = 5; //0101

        int bitMask = num << pos;

        if ((bitMask & num) == 0){
            System.out.println("the value at "+ pos + " no. position = 0");
        }
        else {
            System.out.println("the value at "+ pos + " no. position = 1");
        }

        //Set Bit

    }
}