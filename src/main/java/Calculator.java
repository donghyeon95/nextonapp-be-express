public class Calculator {
    public int calc(int a, int b, char op){
        int result;
        switch(op){
            case '+':
                result= a+b;
                break;
            case '-':
                result= a-b;
                break;
            case '*':
                result= a*b;
                break;
            case '/':
                result= a/b;
                break;
            default:
                result = Integer.MIN_VALUE;
        }
        return result;
    }
}
