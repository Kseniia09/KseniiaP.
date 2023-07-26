package hillel.rest;

import LessonsAll.rest.PostController;
import LessonsAll.rest.entities.Post;
import org.testng.annotations.Test;

import java.io.IOException;

public class RestPostTest {
    @Test
    public void getAllPostsTest() throws IOException {
        PostController postController = new PostController();
//        postController.getAllPosts();

//        postController.getPostById(1);
//        postController.getPostById(10);

//        postController.createNewPostWithJson();

        Post post = new Post();
        post.setUserId(1);
        post.setTitle("GSON title");
        post.setBody("GSON body");


        postController.createNewPostWithGson(post);



    }

}
