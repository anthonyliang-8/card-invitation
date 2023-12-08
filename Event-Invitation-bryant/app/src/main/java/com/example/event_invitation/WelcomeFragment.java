package com.example.event_invitation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.event_invitation.databinding.FragmentWelcomeBinding;

import java.util.List;

public class WelcomeFragment extends Fragment {
    private FragmentWelcomeBinding binding;
    private EventViewModel mEventViewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // creates FragmentWelcomeBinding object that's linked to fragment's layout
        binding = FragmentWelcomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        final EventListAdapter adapter = new EventListAdapter(new EventListAdapter.EventDiff());
        //EventListAdapter adapter = EventListAdapterSingleton.getInstance();

        RecyclerView recyclerView = binding.recyclerview;
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        // Get a new or existing ViewModel from the ViewModelProvider.
        mEventViewModel = new ViewModelProvider(this).get(EventViewModel.class);

     //   LiveData<List<String>> eventNames = mEventViewModel.getAllEventNames();
      //  List<Event> allevents = mEventViewModel.getAllEvents().getValue();
      //  Log.d("Debug Welcome", "list size: "+ String.valueOf(allevents.size()));

        mEventViewModel.getAllEvents().observe(getViewLifecycleOwner(), events -> {

      //      List<Event> allevents = mEventViewModel.getAllEvents().getValue();
       //     Log.d("Debug Welcome", "list size: "+ String.valueOf(allevents.size()));
     //   mEventViewModel.getAllEventNames()s().observe(getViewLifecycleOwner(), names -> {
            // Update the cached copy of the e in the adapter.
      //      Log.d("Debug Welcome Event", events.get(0).getEventName());
        //    Log.d("Debug Welcome Event", events.get(1).getEventName());
        //    Log.d("Debug Welcome Event", events.get(2).getEventName());
            Log.d("Debug Welcome", "events number: " +String.valueOf(events.size()));
            adapter.submitList(events);
        });

        binding.invBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.action_welcomeFragment_to_inviteFragment);
            }
        });
        //clear button listener, delete data from repository
        binding.clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEventViewModel.deleteAll();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}