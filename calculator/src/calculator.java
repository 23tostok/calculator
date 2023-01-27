import java.util.Scanner;

public class calculator {
    
    public static float firstNum = 0;

    public static float secNum = 0;

    public static float result = 0;

    static void space(){
        System.out.println("");
    }

    static void calc(){
        /* Operator */
        Scanner input = new Scanner(System.in);
        space();
        System.out.println("(1: ADD) (2: SUBTRACT) (3: MULTIPLY) (4: DIVIDE) (5: END)");
        space();
        int function = input.nextInt();

        switch(function) {
            /* Add */
            case 1:
                /* First number */
                space();
                System.out.println("ENTER A NUMBER.");
                space();
                firstNum = input.nextFloat();
                /* Second Number */
                space();
                System.out.println("ENTER ANOTHER NUMBER.");
                space();
                secNum = input.nextFloat();
                /* Function */
                result = firstNum + secNum;
                space();
                System.out.println(result);
                calc();
                break;
            /* Subtract */
            case 2:
                /* First number */
                space();
                System.out.println("ENTER A NUMBER.");
                space();
                firstNum = input.nextFloat();
                /* Second Number */
                space();
                System.out.println("ENTER ANOTHER NUMBER.");
                space();
                secNum = input.nextFloat();
                /* Function */
                result = firstNum - secNum;
                space();
                System.out.println(result);
                calc();
                break;
            /* Multiply */
            case 3:
                /* First number */
                space();
                System.out.println("ENTER A NUMBER.");
                space();
                firstNum = input.nextFloat();
                /* Second Number */
                space();
                System.out.println("ENTER ANOTHER NUMBER.");
                space();
                secNum = input.nextFloat();
                /* Function */
                result = firstNum * secNum;
                space();
                System.out.println(result);
                calc();
                break;
            /* Divide */   
            case 4:
                /* First number */
                space();
                System.out.println("ENTER A NUMBER.");
                space();
                firstNum = input.nextFloat();
                /* Second Number */
                space();
                System.out.println("ENTER ANOTHER NUMBER.");
                space();
                secNum = input.nextFloat();
                /* Function */
                result = firstNum / secNum;
                space();
                System.out.println(result);
                calc();
                break;
            /* End */
            case 5:
                space();
                System.out.println("PROGRAM ENDED");
                space();
                break;
            /* invalid options */
            default:
                space();
                System.out.println("INVALID OPTION.");
                calc();
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        calc();
    }
}
