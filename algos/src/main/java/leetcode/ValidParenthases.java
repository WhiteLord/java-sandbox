package leetcode;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParenthases {
    public static boolean isValid(String s) {
        if (s.length() %2 != 0) {
            return false;
        }
        Stack<String> openingStack = new Stack<>();

        char[] chars = s.toCharArray();
        for (char c: chars) {
            if (isOpeningChar(c)) {
                openingStack.add("" + c);
            }
            if (isClosingChar(c)) {
                if (openingStack.empty()) {
                    return false;
                }
                if (!isCorrectClosingChar(c, openingStack)) {
                    return false;
                }
            }
        }
        return openingStack.empty();
    }

    public static boolean isOpeningChar(char c) {
        return ( ("" + c).equals("(") || ("" + c).equals("[") || ("" + c).equals("{"));
    }

    public static boolean isClosingChar(char c) {
        return ( ("" + c).equals(")") || ("" + c).equals("]") || ("" + c).equals("}"));
    }

    public static boolean isCorrectClosingChar(char c, Stack<String> sampleStack) {
        String lastCharacter = sampleStack.peek();
        String whatWeHave = "" + c;
        if (lastCharacter.equals("(") && whatWeHave.equals(")") ||
                lastCharacter.equals("[") && whatWeHave.equals("]") ||
                lastCharacter.equals("{") && whatWeHave.equals("}")
        ) {
            sampleStack.pop();
            return true;
        }
        return false;
    }
}
