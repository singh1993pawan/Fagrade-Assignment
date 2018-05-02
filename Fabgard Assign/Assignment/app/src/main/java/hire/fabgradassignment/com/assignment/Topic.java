
package hire.fabgradassignment.com.assignment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Topic {

    @SerializedName("ust_icon")
    @Expose
    private String ustIcon;
    @SerializedName("live_on")
    @Expose
    private Object liveOn;
    @SerializedName("total_subtopics")
    @Expose
    private Integer totalSubtopics;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("pos")
    @Expose
    private Integer pos;
    @SerializedName("completed_subtopics")
    @Expose
    private Integer completedSubtopics;
    @SerializedName("live")
    @Expose
    private Boolean live;
    @SerializedName("id")
    @Expose
    private Integer id;

    public String getUstIcon() {
        return ustIcon;
    }

    public void setUstIcon(String ustIcon) {
        this.ustIcon = ustIcon;
    }

    public Object getLiveOn() {
        return liveOn;
    }

    public void setLiveOn(Object liveOn) {
        this.liveOn = liveOn;
    }

    public Integer getTotalSubtopics() {
        return totalSubtopics;
    }

    public void setTotalSubtopics(Integer totalSubtopics) {
        this.totalSubtopics = totalSubtopics;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Integer getCompletedSubtopics() {
        return completedSubtopics;
    }

    public void setCompletedSubtopics(Integer completedSubtopics) {
        this.completedSubtopics = completedSubtopics;
    }

    public Boolean getLive() {
        return live;
    }

    public void setLive(Boolean live) {
        this.live = live;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
