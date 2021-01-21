package com.example.aro_passenger;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aro_passenger.Adapter.ContactsAdapter;

import java.util.ArrayList;

public class ListClassActivity extends AppCompatActivity {

    public static final String TAG = ListClassActivity.class.getSimpleName();

    private Context context = ListClassActivity.this;

    private RecyclerView rvContacts;

    ArrayList<Contact> contacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        initializeXML();

        initialWorks();

        clickListeners();
    }


    /**
     * Initializing XML Views
     */
    private void initializeXML() {
        // Lookup the recyclerview in activity layout
        rvContacts = (RecyclerView) findViewById(R.id.rvContacts);
    }


    /**
     * Contains Initial Works
     */
    private void initialWorks() {
        // Initialize contacts
        contacts = Contact.createContactsList(200);
        // Create adapter passing in the sample user data
        ContactsAdapter adapter = new ContactsAdapter(contacts);
        // Attach the adapter to the recyclerview to populate items
        rvContacts.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        // Optionally customize the position you want to default scroll to
        layoutManager.scrollToPosition(0);

        //StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);

        // Set layout manager to position the items
        rvContacts.setLayoutManager(layoutManager);
    }


    /**
     * Listens All Actions
     */
    private void clickListeners() {
    }
}
