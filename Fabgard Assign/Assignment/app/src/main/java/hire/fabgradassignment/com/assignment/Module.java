
package hire.fabgradassignment.com.assignment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Module {

    @SerializedName("topics")
    @Expose
    private List<Topic> topics = null;
    @SerializedName("name")
    @Expose
    private String name;

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
