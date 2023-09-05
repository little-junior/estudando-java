package Metodos;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();

        arrayList.add("oii");
        arrayList.add("oiiaaaa");


        arrayList.forEach(s -> {
            String novaStringSemEspaco = s.trim();
            System.out.println(novaStringSemEspaco);
        });


    }
}
