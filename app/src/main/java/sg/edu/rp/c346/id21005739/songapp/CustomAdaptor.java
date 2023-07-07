package sg.edu.rp.c346.id21005739.songapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdaptor extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Song> versionList;

    public CustomAdaptor(Context context, int resource, ArrayList<Song> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);
        EditText etName = rowView.findViewById(R.id.editTextName);

        Song currentVersion = versionList.get(position);

        tvTitle.setText(currentVersion.getTitle());
        tvYear.setText(currentVersion.getYear());
        etName.setText(currentVersion.getSingers());

        return rowView;
    }

}