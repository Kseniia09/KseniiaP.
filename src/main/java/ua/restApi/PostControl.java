package ua.restApi;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class PostControl {
    public void newPostsWithJson(String title, String body) throws IOException {

        JSONObject json = new JSONObject();
        json.put("userId", 1);
        json.put("title", title);
        json.put("body", body);

        RequestBody requestBody = RequestBody.create(json.toString().getBytes());

        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/")
                .post(requestBody)
                .header("Content-Type", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());

    }

    public void newPutWithJson(String title, String body) throws IOException {

        JSONObject json = new JSONObject();
        json.put("userId", 2);
        json.put("title", title);
        json.put("body", body);

        RequestBody requestBody = RequestBody.create(json.toString().getBytes());

        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/1")
                .put(requestBody)
                .header("Content-Type", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());

    }

    public void newPatchWithJson(String title, String body) throws IOException {
        JSONObject json = new JSONObject();
        json.put("userId", 2);
        json.put("title", title);
        json.put("body", body);

        RequestBody requestBody = RequestBody.create(json.toString().getBytes());

        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/1")
                .patch(requestBody)
                .header("Content-Type", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());

    }

    public void newDelete(){

        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/1")
                .delete()
                .build();

    }
}