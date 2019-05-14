package softepec.es.ejemplohttp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Date;

public class Adapter extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Post> items;

    public Adapter(Activity activity, ArrayList<Post> items){
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public void clear(){
        items.clear();
    }

    public void addAll(ArrayList<Post> datos){
        for (int i = 0; i < datos.size(); i++){
            items.add(datos.get(i));
        }
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.item,null);
        }

        Post dir = items.get(position);
        TextView id = v.findViewById(R.id.id);
        id.setText(dir.getId());

        TextView title = v.findViewById(R.id.title);
        title.setText(dir.getTitle());

        TextView body = v.findViewById(R.id.body);
        body.setText(dir.getBody());
        return v;
    }
}
