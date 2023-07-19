package hillel.restApi;

import org.testng.annotations.Test;
import ua.restApi.PostControl;

import java.io.IOException;

public class RestApiTest {
    @Test
    public void newPostTest() throws IOException {
        PostControl postControl = new PostControl();
        postControl.newPostsWithJson("New post title from test", "");

    }

    @Test
    public void newPutTest() throws IOException {
        PostControl postControl = new PostControl();
        postControl.newPutWithJson("New Put title","New Put body");

    }

    @Test
    public void newPatchTest() throws IOException {
        PostControl postControl = new PostControl();
        postControl.newPatchWithJson("New Patch title", "");
    }

    @Test
    public void newDeleteTest(){
        PostControl postControl = new PostControl();
        postControl.newDelete();
    }
}
