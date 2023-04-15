package org.example;

import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Stack;
public class Calculation {
    private static final char Plus = '+';
    private static final char Minus = '-';
    private static final char Div = '/';
    private static final char Mult = '*';

    @NotNull
    public double calc(String str) {
        Stack <Double> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case '1': {
                    stack.push(1D);
                    break;
                }
                case '2': {
                    stack.push(2D);
                    break;
                }
                case '3': {
                    stack.push(3D);
                    break;
                }
                case '4': {
                    stack.push(4D);
                    break;
                }
                case '5': {
                    stack.push(5D);
                    break;
                }
                case '6': {
                    stack.push(6D);
                    break;
                }
                case '7': {
                    stack.push(7D);
                    break;
                }
                case '8': {
                    stack.push(8D);
                    break;
                }
                case '9': {
                    stack.push(9D);
                    break;
                }
                case '0': {
                    stack.push(0D);
                    break;
                }
                case Plus:
                {
                    double res = stack.pop();
                    double b = stack.pop();
                    res += b;
                    stack.push(res);
                    break;
                }
                case Minus:
                {
                    double res = stack.pop();
                    double b = stack.pop();
                    res -= b;
                    stack.push(res);
                    break;
                }
                case Div:
                {
                    double res = stack.pop();
                    double b = stack.pop();
                    res /= b;
                    stack.push(res);
                    break;
                }
                case Mult:
                {
                    double res = stack.pop();
                    double b = stack.pop();
                    res *= b;
                    stack.push(res);
                    break;
                }
            }
        }
        return stack.pop();
    }
}
