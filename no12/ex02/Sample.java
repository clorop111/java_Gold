package ex02;

import java.text.Normalizer;
import java.text.Normalizer.Form;

public class Sample {
    public static void main(String[] args) {
        String de = "\u3066\u3099";
        System.out.println(de);
        System.out.println(de.length());

        String result = Normalizer.normalize(de, Form.NFKC);
        System.out.println(result);
        System.out.println(result.length());
    }
}