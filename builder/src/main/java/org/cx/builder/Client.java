package org.cx.builder;

import java.util.HashMap;
import java.util.Map;

public class Client {

//    private JsonConverter converter = new JsonConverter();
    private XmlConverter converter = new XmlConverter();
    private DataParser dataParser = new DataParser(converter);;

    public void construct() {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "builder");
        data.put("time", 1487221556);

        dataParser.parse(data);
        converter.getResult();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.construct();
    }

}
