package org.example.examples.mash;

import javafx.util.Pair;
import org.example.examples.AbstractExampleClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// https://leetcode.com/problems/longest-common-prefix/description/

public class ExampleMash2 extends AbstractExampleClass {
    public void runContent() {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flower", "flower", "flower"}));
    }


    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();

        String infoItem = getMinItem(strs);

        for (int i = 0; i < infoItem.length(); i++) {
            if (check(strs, infoItem.charAt(i), i))
                res.append(infoItem.charAt(i));
            else
                break;
        }

        return res.toString();
    }

    private String getMinItem(String[] strs) {
        String res = strs[0];
        for (String str : strs) {
            if (str.length() < res.length())
                res = str;
        }
        return res;
    }

    private boolean check(String[] strs, Character ch, int j) {
        for (String str : strs) {
            if (str.charAt(j) != ch)
                return false;
        }
        return true;
    }

}
