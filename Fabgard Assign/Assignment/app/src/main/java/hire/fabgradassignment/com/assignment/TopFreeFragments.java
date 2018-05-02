package hire.fabgradassignment.com.assignment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFreeFragments extends ListFragment {


    int[] ust_icon = {R.drawable.t2,R.drawable.t2,R.drawable.t2};
    String[] live_on = {"live_on : NA","live_on : NA","live_on : NA"};
    String[] total_subtopics = {"total_subtopics : 3","total_subtopics : 3","total_subtopics : 3"};
    String[] title = {"title : Transistors ##","title : MOSFET ##","title : Inverter ##"};
    String[] pos = {"pos : 2","pos : 3","pos : 4"};
    String[] completed_subtopics = {"completed_subtopics : 2","completed_subtopics : 3","completed_subtopics : 3"};
    String[] live = {"live : false","live : false","live : false"};
    String[] id = {"id : 16","id : 17","id : 18"};


    ArrayList<HashMap<String,String>> data = new ArrayList<HashMap<String, String>>();
    SimpleAdapter adapter;



    public TopFreeFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top_free_fragments, container, false);

        HashMap<String, String> map = new HashMap<String, String>();

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

        String[] from = {"ust_icon","live_on","total_subtopics","title","pos","completed_subtopics","live","id"};

        int[] to = {R.id.img1,R.id.txt1,R.id.txt2,R.id.txt3,R.id.txt4,R.id.txt5,R.id.txt6,R.id.txt7};

        adapter = new SimpleAdapter(getActivity(),data, R.layout.list2, from, to);

        setListAdapter(adapter);


        return view;
    }

    @Override
    public void onStart() {
        super.onStart();


    }

}
