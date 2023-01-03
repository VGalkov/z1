package org.example.tests;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class TestBigDecInMap extends CommonTestClass {

    @Override
    public void runContent() {
        BigDecimal number = new BigDecimal(100);
        Map<String, BigDecimal> params = new HashMap<String, BigDecimal>();
        params.put("key1", number);

        BigDecimal nn = params.get("key1");
        nn = nn.add(new BigDecimal(11));

        System.out.println("Значение в коде: " + nn);
        System.out.println("Значение в мапе: " + params.get("key1"));
        System.out.println(nn.add(new BigDecimal(11)));
    }

}
