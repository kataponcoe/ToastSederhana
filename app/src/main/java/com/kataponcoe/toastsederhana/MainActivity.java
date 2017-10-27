package com.kataponcoe.toastsederhana;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {
	String[] wisata = { "Alun-Alun Kota",
			"Kawah Ijen",
			"Pantai Watu Dodol",
			"Teluk Hijau",
			"Pantai Sukamade",
			"Air Terjun Lider",
			"Pantai Bedul",
			"Alas Purwa",
			"Pantai Plengkung",
			"Pulau Merah"};
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, wisata));
		}
	
	public void onListItemClick(ListView parent, View v, int urutan, long id) {
		Object detail = this.getListAdapter().getItem(urutan);
		String tampil = detail.toString();
		Toast.makeText(this, "Wisata Banyuwangi : " + tampil, Toast.LENGTH_SHORT).show();
		
	}
	
}