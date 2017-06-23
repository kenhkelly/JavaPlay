public class JsonPlay {
    
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Cake\",\"batters\":{\"batter\":[{\"id\":\"1001\",\"type\":\"Regular\"},{\"id\":\"1002\",\"type\":\"Chocolate\"},{\"id\":\"1003\",\"type\":\"Blueberry\"},{\"id\":\"1004\",\"type\":\"Devil's Food\"}]},\"topping\":[{\"id\":5001,\"type\":\"None\"},{\"id\":5002,\"type\":\"Glazed\"},{\"id\":5005,\"type\":\"Sugar\"},{\"id\":5007,\"type\":\"Powdered Sugar\"},{\"id\":5006,\"type\":\"Chocolate with Sprinkles\"},{\"id\":5003,\"type\":\"Chocolate\"},{\"id\":5004,\"type\":\"Maple\"}]}";

        parseJson2(jsonString);
    }

    public void parseJson2(String jsonString2) throws JSONException{

        JSONObject obj=new JSONObject(jsonString2);
        String name=obj.getString("name");
         
        System.out.println("Name is: "+name);
         
        JSONObject obj2=obj.getJSONObject("batters");
         
        //Here we get json array inside obj2 with key- batter
        JSONArray array=obj2.getJSONArray("batter");
         
        //Getting json objects inside array
        for(int i=0;i<array.length();i++){
            JSONObject obj3=array.getJSONObject(i);
            //Getting id and type of json objects inside array
            System.out.println("Id of obj3 : "+obj3.getString("id")+" Type of obj3 : "+obj3.getString("type"));
        }
         
        //Here we get json array inside obj1 with key- topping
        JSONArray array2=obj.getJSONArray("topping");
         
        //Getting json objects inside array
        for(int i=0;i<array2.length();i++){
            JSONObject obj4=array2.getJSONObject(i);
            //Getting id and type of json objects inside array2
            System.out.println("Id of obj4 at index "+i+" is : "+obj4.getInt("id")+" Type of obj4 at index "+i+" is : "+obj4.getString("type"));
        }
         
    }
}