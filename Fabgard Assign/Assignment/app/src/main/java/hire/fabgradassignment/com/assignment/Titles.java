
package hire.fabgradassignment.com.assignment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Titles {

    @SerializedName("modules")
    @Expose
    private List<Module> modules = null;

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

}
