package devsbox.discount_on.Activity;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import devsbox.discount_on.R;

/**
 * Created by Jihan on 23-Aug-17.
 */

public class ListViewCustomAdaptor extends ArrayAdapter<String> {


    private final Activity context;
    private final Integer[] imageID_left;
    private final Integer[] imageID_right;
    private final String[] title_left;
    private final String[] title_right;


    public ListViewCustomAdaptor(Activity context, Integer[] imageID_left, Integer[] imageID_right, String[] title_left, String[] title_right) {
        super(context, R.layout.item_listview,title_left);
        this.context = context;

        this.imageID_left = imageID_left;
        this.imageID_right = imageID_right;
        this.title_left = title_left;
        this.title_right = title_right;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater layoutInflater = context.getLayoutInflater();

        View rowView = layoutInflater.inflate(R.layout.item_listview,null,true);

        ImageView imageView_left = (ImageView) rowView.findViewById(R.id.ImageLeft);
        ImageView imageView_right = (ImageView) rowView.findViewById(R.id.ImageRight);

        TextView title_left_tv = (TextView) rowView.findViewById(R.id.TitleLeftTV);
        TextView title_right_tv = (TextView) rowView.findViewById(R.id.TitleRightTV);

        title_left_tv.setText(title_left[position]);
        title_right_tv.setText(title_right[position]);

        imageView_left.setImageResource(imageID_left[position]);
        imageView_right.setImageResource(imageID_right[position]);

        return rowView;
    }
}
