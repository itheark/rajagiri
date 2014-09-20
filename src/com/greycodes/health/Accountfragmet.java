package com.greycodes.health;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



public class Accountfragmet extends Fragment {
TextView tvname,tvage;
ImageView scan;
ListView medicine;
SharedPreferences sharedPreferences;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	View rootView =	inflater.inflate(R.layout.accountfragment, container, false);
	
	
	tvname = (TextView) rootView.findViewById(R.id.account_name);
	tvage = (TextView) rootView.findViewById(R.id.account_age);
	scan = (ImageView) rootView.findViewById(R.id.account_scanner);
	medicine = (ListView) rootView.findViewById(R.id.account_list);
	
	return rootView;
	}

	
}
