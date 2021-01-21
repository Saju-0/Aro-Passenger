package com.example.aro_passenger.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.example.aro_passenger.Adapter.CustomExpandableListAdapter;
import com.example.aro_passenger.CustomExpandableListView;
import com.example.aro_passenger.ExpandableListDataPump;
import com.example.aro_passenger.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AirportFragment extends Fragment {
    public static final String TAG = AirportFragment.class.getSimpleName();

    private Context context = AirportFragment.this.getContext();

    private View view = null;

    private Spinner sp_passengers;

    private String[] num_of_passengers_arr = {"1-8", "9-21", "22-55"};


    CustomExpandableListView customExpandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.airport, viewGroup, false);

        initializeXML();

        initialWorks();

        clickListeners();

        return view;
    }

    /**
     * Initializing XML Views
     */
    private void initializeXML() {

        sp_passengers = view.findViewById(R.id.sp_passengers);

        customExpandableListView = (CustomExpandableListView) view.findViewById(R.id.elv_vehicle_list);
    }

    /**
     * Contains Initial Works
     */
    private void initialWorks() {

        ArrayAdapter aa = new ArrayAdapter(getActivity().getApplicationContext(), android.R.layout.simple_spinner_item, num_of_passengers_arr);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp_passengers.setAdapter(aa);

        customExpandableListView.setExpanded(true);

        expandableListDetail = ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());

        expandableListAdapter = new CustomExpandableListAdapter(getActivity(), expandableListTitle, expandableListDetail);

        customExpandableListView.setAdapter(expandableListAdapter);
    }

    /**
     * Listens All Actions
     */
    private void clickListeners() {
        sp_passengers.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), num_of_passengers_arr[position] + " Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

        customExpandableListView.setOnGroupExpandListener(groupPosition -> Toast.makeText(getActivity(),
                expandableListTitle.get(groupPosition) + " List Expanded.",
                Toast.LENGTH_SHORT).show());

        customExpandableListView.setOnGroupCollapseListener(groupPosition -> Toast.makeText(getActivity(),
                expandableListTitle.get(groupPosition) + " List Collapsed.",
                Toast.LENGTH_SHORT).show());

        customExpandableListView.setOnChildClickListener((parent, v, groupPosition, childPosition, id) -> {
            Toast.makeText(
                    getActivity(),

                    expandableListTitle.get(groupPosition)
                            + " -> "
                            + expandableListDetail.get(
                            expandableListTitle.get(groupPosition)).get(
                            childPosition), Toast.LENGTH_SHORT
            ).show();
            return false;
        });
    }
}





