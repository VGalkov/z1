package org.example.examples.mash;

import org.example.examples.AbstractExampleClass;

// https://leetcode.com/problems/reverse-words-in-a-string/submissions/1398611110/

public class ExampleMash3 extends AbstractExampleClass {
    public void runContent() {
        System.out.println("the sky is blue");
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        String[] res = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = res.length - 1; i >= 0; i--) {
            if (!" ".equals(res[i]) && !"".equals(res[i]))
                str.append(res[i]).append(" ");
        }
        return str.toString().trim();

    }

}
