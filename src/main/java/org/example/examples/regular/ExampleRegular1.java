package org.example.examples.regular;

import org.example.examples.AbstractExampleClass;
import java.util.regex.Pattern;

public class ExampleRegular1 extends AbstractExampleClass {

    @Override
    public void runContent() {
        int a = 20;
        int b = 20;

        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
    }

    private String checkWrongSymbols(String attrCode) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        if (pattern.matcher(attrCode).find()) {
            attrCode = attrCode.replaceAll("[^A-Za-z0-9]", "");
            // "excludeWrongSymbols"
        }
        return attrCode;
    }

    private String checkFirstDigit(String attrCode) {
        Pattern pattern = Pattern.compile("^[-+]?[0-9]{1}");
        if (pattern.matcher(attrCode).find()) {
            attrCode = "_" + attrCode;
            // "replaceFirstDigit"
        }
        return attrCode;
    }
}