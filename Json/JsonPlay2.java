public class JsonPlay2 {

  public static void main(String[] args) {
    String jsonString = "{\"name\":\"Cake\",\"batters\":{\"batter\":[{\"id\":\"1001\",\"type\":\"Regular\"},{\"id\":\"1002\",\"type\":\"Chocolate\"},{\"id\":\"1003\",\"type\":\"Blueberry\"},{\"id\":\"1004\",\"type\":\"Devil's Food\"}]},\"topping\":[{\"id\":5001,\"type\":\"None\"},{\"id\":5002,\"type\":\"Glazed\"},{\"id\":5005,\"type\":\"Sugar\"},{\"id\":5007,\"type\":\"Powdered Sugar\"},{\"id\":5006,\"type\":\"Chocolate with Sprinkles\"},{\"id\":5003,\"type\":\"Chocolate\"},{\"id\":5004,\"type\":\"Maple\"}]}";
    jsonDo(jsonString);
  }

  public static void jsonDo(String jsonString) {
    JsonParserFactory factory = Json.createParserFactory(null);
    JsonParser parser = factory.createParser(new StringReader(jsonString));

    while (parser.hasNext()) {
      Event event = parser.next();

      switch (event) {
        case KEY_NAME: {
          System.out.print(parser.getString() + "="); break;
        }
        case VALUE_STRING: {
          System.out.println(parser.getString()); break;
        }
      }
    }
  }


}