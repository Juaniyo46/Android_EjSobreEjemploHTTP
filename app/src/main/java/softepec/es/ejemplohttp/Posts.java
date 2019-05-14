package softepec.es.ejemplohttp;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Posts {
    private ArrayList<Post> list;

    public ArrayList<Post> getList() {
        return list;
    }

    public Posts(){this.list = new ArrayList<>();}

    public Posts(ArrayList<Post> postList) {
        this.list = postList;
    }

    public String toJSON(){
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }

    public Posts fromJSON(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json,Posts.class);
    }


    @Override
    public String toString() {
        return "Posts{" +
                "postList=" + list +
                '}';
    }
}
