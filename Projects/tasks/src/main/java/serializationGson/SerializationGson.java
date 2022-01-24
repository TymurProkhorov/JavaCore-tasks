package serializationGson;

import com.google.gson.Gson;

public class SerializationGson {
    public static void main(String[] args) {
        String str = "asd";
        Gson gson = new Gson();

        String json = gson.toJson(str);
        System.out.println(json);

        String obj = gson.fromJson(json, String.class);
        System.out.println(obj);
    }
}
