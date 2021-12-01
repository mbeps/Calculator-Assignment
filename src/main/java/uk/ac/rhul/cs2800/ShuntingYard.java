package uk.ac.rhul.cs2800;

public class ShuntingYard {
    /**
     * Orders sign by precedence. 
     * Higher precedence returns higher value. 
     * @param sign (char): sign to be tested for precedence
     * @return (int): precedence of the sign
     */
    public static int getPrecedence(char sign) {
        if (sign == '+' || sign == '-') {
            return 1;
        } else if (sign == '*' || sign == '/') {
            return 2;
        } else if (sign == '^') {
            return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getPrecedence('+'));
    }
}
