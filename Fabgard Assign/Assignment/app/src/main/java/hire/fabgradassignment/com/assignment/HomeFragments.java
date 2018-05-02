package hire.fabgradassignment.com.assignment;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragments extends ListFragment {


    int[] ust_icon = {R.drawable.title,R.drawable.t2,R.drawable.t2};
    String[] live_on = {"live_on : NA","live_on : NA","live_on : NA"};
    String[] total_subtopics = {"total_subtopics : 3","total_subtopics : 3","total_subtopics : 3"};
    String[] title = {"title : semiconductor devices ##","title : Equations of state ##","title : pn junction ##"};
    String[] pos = {"pos : 1","pos : 5","pos : 6"};
    String[] completed_subtopics = {"completed_subtopics : 3","completed_subtopics : 3","completed_subtopics : 3"};
    String[] live = {"live : false","live : false","live : false"};
    String[] id = {"id : 13","id : 14","id : 15"};


    ArrayList<HashMap<String,String>> data = new ArrayList<HashMap<String, String>>();
    SimpleAdapter adapter;

    public HomeFragments() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_fragments, container, false);

        HashMap<String, String> map = new HashMap<String, String>();
        data.clear();
        for (int i=0;i<3;i++)
        {
            map = new HashMap<String, String>();
            map.put("ust_icon", Integer.toString(ust_icon[i]));
            map.put("live_on",live_on[i]);
            map.put("total_subtopics",total_subtopics[i]);
            map.put("title",title[i]);
            map.put("pos",pos[i]);
            map.put("completed_subtopics",completed_subtopics[i]);
            map.put("live",live[i]);
            map.put("id",id[i]);

            data.add(map);
        }



        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), "h.ttf");

            String[] from = {"ust_icon", "live_on", "total_subtopics", "title", "pos", "completed_subtopics", "live", "id"};

            int[] to = {R.id.img1, R.id.txt1, R.id.txt2, R.id.txt3, R.id.txt4, R.id.txt5, R.id.txt6, R.id.txt7};

            adapter = new SimpleAdapter(getActivity(), data, R.layout.list1, from, to);

            setListAdapter(adapter);


        return view;
    }

    @Override
    public void onStart() {
        super.onStart();




    }
}
