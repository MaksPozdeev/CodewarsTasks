package kyu_6;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Instrucrions:
 * Your job is to create a calculator which evaluates expressions in Reverse Polish notation.
 * For example expression 5 1 2 + 4 * + 3 - (which is equivalent to 5 + ((1 + 2) * 4) - 3 in normal notation) should evaluate to 14.
 * For your convenience, the input is formatted such that a space is provided between every token.
 * Empty expression should evaluate to 0.
 * Valid operations are +, -, *, /.
 * You may assume that there won't be exceptional situations (like stack underflow or division by zero).
 */

public class ReversePolishNotationCalculator {

    public double evaluate(String expr) {
        if (expr.equals("")) return 0;
        LinkedList<String> stek = new LinkedList<>();
        String[] arr = expr.split("\\s");
        double tmp1;
        double tmp2;
        double result = 0;
        for (String st : arr) {
            if (isNumber(st)) {
                stek.add(st);
                continue;
            }
            tmp2 = Double.parseDouble(stek.removeLast());
            tmp1 = Double.parseDouble(stek.removeLast());
            switch (st) {
                case ("+"): {
                    result = tmp1 + tmp2;
                    break;
                }
                case ("-"): {
                    result = tmp1 - tmp2;
                    break;
                }
                case ("*"): {
                    result = tmp1 * tmp2;
                    break;
                }
                default: {
                    result = tmp1 / tmp2;
                    break;
                }
            }
            stek.add(Double.toString(result));
        }
        return Double.parseDouble(stek.removeLast());
    }

    private static boolean isNumber(String str) {
        Matcher m = Pattern.compile("\\d+(\\.\\d+)?").matcher(str);
        return m.find();
    }
}

//Best practice

//    public double evaluate(String expr) {
//        if (expr.equals("")) {
//            return 0;
//        }
//
//        Stack<Double> stack = new Stack<Double>();
//        String[] atoms = expr.split(" ");
//
//        for (String atom: atoms) {
//            Double a, b;
//            switch (atom) {
//                case "+": stack.push(stack.pop() + stack.pop()); break;
//                case "-": b = stack.pop(); a = stack.pop(); stack.push(a - b); break;
//                case "*": stack.push(stack.pop() * stack.pop()); break;
//                case "/": b = stack.pop(); a = stack.pop(); stack.push(a / b); break;
//                default:
//                    stack.push(Double.parseDouble(atom));
//            }
//        }
//        return stack.pop();

//----------------------------------------------------------------------------------------------------------------------
//    private static final Pattern OP = Pattern.compile("(-?\\d*\\.?\\d+) (-?\\d*\\.?\\d+) ([+*/-])");
//
//    double evaluate(final String text) {
//        if (text.isEmpty()) {
//            return 0;
//        }
//        final StringBuilder sb = new StringBuilder(text);
//        final Matcher matcher = OP.matcher(sb);
//        while (matcher.find()) {
//            final double x = parseDouble(matcher.group(1));
//            final double y = parseDouble(matcher.group(2));
//            switch (matcher.group(3)) {
//                case "+":
//                    sb.replace(matcher.start(), matcher.end(), Double.toString(x + y));
//                    break;
//                case "-":
//                    sb.replace(matcher.start(), matcher.end(), Double.toString(x - y));
//                    break;
//                case "*":
//                    sb.replace(matcher.start(), matcher.end(), Double.toString(x * y));
//                    break;
//                case "/":
//                    sb.replace(matcher.start(), matcher.end(), Double.toString(x / y));
//                    break;
//            }
//            matcher.reset(sb);
//        }
//        final int spaceIndex = sb.lastIndexOf(" ");
//        return spaceIndex != -1 ?
//                parseDouble(sb.substring(spaceIndex + 1)) :
//                parseDouble(sb.toString());
//    }